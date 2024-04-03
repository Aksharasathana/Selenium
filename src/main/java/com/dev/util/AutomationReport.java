package com.dev.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {

	public static void main(String[] args) {
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Report.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest test = extent.createTest("TC001 - Search the product");
		test.pass("Sign up to the Appln");
		test.pass("Upload the product");
		test.pass("Successfully search the product");
		test.pass("product added to cart");
		test.assignAuthor("Sankar");
		test.assignCategory("Sanity");
		ExtentTest test2 = extent.createTest("TC002-PAYMENT ADD");
				test2.pass("Card entered");
				test2.fail("Txn Timed out", 
						MediaEntityBuilder
						.createScreenCaptureFromPath("image1.png")
						.build()
						);
			
		
		extent.flush();
		
	}

}
