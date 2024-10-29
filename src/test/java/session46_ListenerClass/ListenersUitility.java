package session46_ListenerClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

@Listeners
public class ListenersUitility implements ITestListener {
	 public void onStart(ITestContext context) {
		   System.out.println("Test Started....");
		  }
	 public  void onTestStart(ITestResult result) {
		 System.out.println("Test Execution Started....");
		  }
	 public  void onTestSuccess(ITestResult result) {
		 System.out.println("Test Success....");
		  }
	 public  void onTestFailure(ITestResult result) {
		 System.out.println("Test Failed....");
		  }
	 public  void onTestSkipped(ITestResult result) {
		 System.out.println("Test Skipped....");
		  }
	 public  void onFinish(ITestContext context) {
		 System.out.println("Test Finished....");
		  }

}
