package com.org.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports report;
	public static ExtentTest testCase;
	
	@BeforeSuite
	public void GenerateExtendReport()
	{
		htmlReporter = new ExtentHtmlReporter("/Users/rahulsingh/eclipse-workspace/RestAssuredAPIAutomation/Files/ExtentReports.html"); 
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
	}
	
	@AfterSuite
	public void SaveExtentReport()
	{
		report.flush();
	}
	

}
