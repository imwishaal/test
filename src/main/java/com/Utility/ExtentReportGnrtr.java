package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class  ExtentReportGnrtr {
	
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		
		
		String path="C:\\Users\\Vishal Chavan\\eclipse-workspace\\akshay\\Reportt";
		ExtentSparkReporter repoter= new ExtentSparkReporter(path);
		repoter.config().setDocumentTitle("LOGIN");
		repoter.config().setReportName("login report");
		repoter.config().setTheme(Theme.DARK);
		
	    extent=new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("Project Name", "login");
		extent.setSystemInfo("brs name", "chrpme");
		extent.setSystemInfo("version", "4.22");
		extent.setSystemInfo("qa", "Vishal");
		return extent;
		
	
		
	

		
		
	}

}
