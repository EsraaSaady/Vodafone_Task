package test.Helpers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ReportSetup {
    private static ExtentReports extent;
    private static ExtentTest test;
    private static ExtentSparkReporter sparkReporter;

    public static void setupReport(){
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("OS", "Windows 11");
        extent.setSystemInfo("Browser", "Chrome");
    }

    public static void generateReport(){
        extent.flush();
    }
}
