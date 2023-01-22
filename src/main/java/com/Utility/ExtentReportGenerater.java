package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerater {

	
	public static ExtentReports getReport() {
		

		String path="E:\\java\\FrameWork2023\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("New Report");
		reporter.config().setReportName("mukesh");
		reporter.config().setTheme(Theme.DARK);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA NAme", "Mukesh Rachalwar");	
		extent.setSystemInfo("Report", "Excel Formate");
		extent.setSystemInfo("Data","Date");
		extent.setSystemInfo("selenium Version", "3.141.49");
		extent.setSystemInfo("Peer Report", "Manoj");
		
		
		
		return extent;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
