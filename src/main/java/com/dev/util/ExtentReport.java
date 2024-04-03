package com.dev.util;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	ExtentReports extent;
	ExtentTest test;
	String description = " ";
	String author = " ";
	String category = " ";

	@BeforeSuite
	protected void startReport()
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Report.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}


	@AfterSuite
	protected void endReport()
	{
		extent.flush();	
	}

	@BeforeClass
	void testAttributes()
	{
		test = extent.createTest(description);
		test.assignAuthor(author);
		test.assignCategory(category);
	}


	void testStatus(String status, String reason)
	{
		switch (status.toLowerCase()) {
		case "pass":
			System.out.println("Testcase passed");
			test.pass(reason);
			break;
		case "fail":
			System.out.println("Testcase failed");
			test.fail(reason);
			break;
		case "info":
			System.out.println("Testcase info");
			test.info(reason);
			break;
		case "warning":
			System.out.println("Testcase warning");
			test.warning(reason);
			break;

		default:
			System.err.println("No Status found");
			break;
		}
	}








}


