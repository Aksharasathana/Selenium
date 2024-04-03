package com.dev.util;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyReport extends ExtentReport {
	
	@BeforeTest
	void setData()
	{
		description = "TC001- Search a Product";
		author = "Sankar";
		category = "Sanity";
	}
	
	@Test
	void myReport()
	{
		System.out.println("Test Begins");
		testStatus("pass", "some reason");
		System.out.println("Test Ends");
		
	}

}
