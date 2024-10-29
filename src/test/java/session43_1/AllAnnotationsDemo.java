package session43_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotationsDemo {
	@Test
	void Test1()
	{
		System.out.println("This is Test step ....");
	}
	@Test
	void Test2()
	{
		System.out.println("This is Test step ....");
	}
	@BeforeMethod
	void BeforeMethod()
	{
		System.out.println("This is Before Method...");
	}
	@AfterMethod
	void AfterMethod()
	{
		System.out.println("This is After Method...");
	}
	@BeforeClass
	void BeforeClass()
	{
		System.out.println("This is Before Class...");
	}
	@AfterClass
	void AfterClass()
	{
		System.out.println("This is After Class...");
	}
	@BeforeTest
	void BeforeTest()
	{
		System.out.println("This is Before Test...");
	}
	@AfterTest
	void AfterTest()
	{
		System.out.println("This is After Test...");
	}
	@BeforeSuite
	void BeforeSuite()
	{
		System.out.println("This is Before Suite...");
	}
	@AfterSuite
	void AfterSuite()
	{
		System.out.println("This is After Suite...");
	}
	
}
