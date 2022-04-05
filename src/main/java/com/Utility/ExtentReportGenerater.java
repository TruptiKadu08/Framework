package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerater {
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String filepath="C:\\Users\\trupt\\eclipse-workspace\\Framework\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(filepath);
		reporter.config().setDocumentTitle("Test Reports DSS");
		reporter.config().setReportName("DSS Automation Report");
		reporter.config().setTheme(Theme.DARK);
		
	    extent =new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("ProjectName", "DSS");
		extent.setSystemInfo("QA","Trupti");
		return extent;
	}

}
