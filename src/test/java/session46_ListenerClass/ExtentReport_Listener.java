package session46_ListenerClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport_Listener implements ITestListener{
	public ExtentSparkReporter sparkextent;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		sparkextent=new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\myReport.html");
		sparkextent.config().setDocumentTitle("Automation Testcases");
		sparkextent.config().setReportName("Functional Test");
		sparkextent.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(sparkextent);
		extent.setSystemInfo("ComputerName", "localhost");
		extent.setSystemInfo("Environment", "test");
		extent.setSystemInfo("TesterName", "Prashanth");
		extent.setSystemInfo("os", "Windows10");
		extent.setSystemInfo("BrowserName", "Chrome");
	}
		
	 public  void onTestSuccess(ITestResult result) {
		
		 test=extent.createTest(result.getName());
		 test.log(Status.PASS, "Test Case Passed is" + result.getName());
	 }
	 public  void onTestFailure(ITestResult result) {
		test= extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case Failed"+result.getName());
		test.log(Status.FAIL,"Test case failed cause is "+result.getThrowable());
		  }
	 public  void onTestSkipped(ITestResult result) {
		 test=extent.createTest(result.getName());
		 test.log(Status.SKIP,"Test case Skipped"+result.getName());
		 test.log(Status.SKIP,"Test case Skipped cause is "+result.getName());
		
		  }
	 public  void onFinish(ITestContext context) {
		 extent.flush();
		  }


}
