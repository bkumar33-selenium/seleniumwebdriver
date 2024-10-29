package session43_1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AfterTestDemo {
	@Test(priority=1)
	void Test()
	{
		System.out.println("This is Test step ....");
	}
	@AfterTest
	void Aftertest()
	{
		System.out.println("This is After Test...");
	}
	

}
