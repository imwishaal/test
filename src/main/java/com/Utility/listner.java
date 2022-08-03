package com.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class listner implements ITestListener  {
	
	
	ExtentReports extent=ExtentReportGnrtr.getReport();
	
	ThreadLocal<ExtentTest> extenttext=new ThreadLocal<ExtentTest>();
	

	public void onTestStart(ITestResult result) {
		
	baseclass.test=	extent.createTest(result.getTestClass().getName() +"=="+ result.getMethod().getMethodName());
	extenttext.set(baseclass.test);
		
	}

	public void onTestSuccess(ITestResult result) {
		extenttext.get().log(Status.PASS, "Test Case Passed");
		
		
		
	}

	public void onTestFailure(ITestResult result) {
		
		extenttext.get().log(Status.FAIL, "Test Case Failed");

		
		
	}

	public void onTestSkipped(ITestResult result) {
		extenttext.get().log(Status.SKIP, "Test Case Skipped");

	}


	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	
	
	
	
	
	
	
	

}
