package Utils;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentReportsListner implements ITestListener {
	
	protected  static ExtentReports report;
	
	protected  static ExtentTest test;
	
	private static  String  resultPath = getResultPath();
	
	public static void deleteDirectory(File directory) {
        // Check if the directory exists
        if (directory.exists()) {
            // List all files and subdirectories
            File[] files = directory.listFiles();

            // Check if the directory is not empty
            if (null != files) {
                for (int i = 0; i < files.length; i++) {
                    // Print the name of the file or directory
                    System.out.println(files[i].getName());

                    // If it's a directory, call the method recursively
                    if (files[i].isDirectory()) {
                        deleteDirectory(files[i]);
                    } else {
                        // Otherwise, delete the file
                        files[i].delete();
                    }
                }
            }}
        }
	

	private static String getResultPath() {
		resultPath ="test";
		if(!new File (resultPath).isDirectory()) {
			new File (resultPath);
		}
		return resultPath;
	}

String	ReportLocation  ="test-output/Report/"+resultPath+"/";
	
	public void onTestStart(ITestResult result) {
		test =report.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName());
		System.out.println(result.getMethod().getMethodName());
		System.out.println(result.getMethod().getMethodName());	
	}
	public void onTestSuccess(ITestResult result) {
	
		test.log(LogStatus.PASS, "test is pass");
	
	}

	public void onTestFailure(ITestResult result) {
		test.log(LogStatus.FAIL, "test is FAIL");
	}

	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, "test is SKIP");
	}	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	  
		
	}

	public void onStart(ITestContext context) {
		System.out.println(ReportLocation + "ReportLocation");
		System.out.println(ReportLocation + "ExtentRepoert.html");
		report = new ExtentReports(resultPath);
		test = report.startTest("");
	}
   
	public void onFinish(ITestContext context) {
		report.endTest(test);
		report.flush();
		
	}

	
	

}
