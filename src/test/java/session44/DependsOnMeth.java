package session44;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMeth {
	
	@BeforeMethod
	void testStart()
	{
		System.out.println("Start");
	}
	@Test
	void openPage()
	{
		System.out.println("This is openPage ....");
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods= {"openPage"})
	void login()
	{
		System.out.println("This is Login Page....");
		Assert.assertTrue(true);
	}
    @Test(priority=3,dependsOnMethods= {"login"})
	void search()
	{
		System.out.println("This is Search ....");
		Assert.assertTrue(false);
	}
	@Test(priority=4,dependsOnMethods= {"login","search"})
	void AdvSearch()
	{
		System.out.println("This is Advanced Search....");
		Assert.assertTrue(true);
	}
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	{
		System.out.println("This is logout Page....");
		Assert.assertTrue(true);
	}
	
}
