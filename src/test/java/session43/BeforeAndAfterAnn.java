/*
 1.Login --@BeforeMethod
 2.Search -- @Test
 3.Advanced Search -- @Test
 4.Logout -- @AfterMethod
 */

package session43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterAnn {
	@BeforeMethod
	void Login()
	{
		System.out.println("Login successfully...");
	}
	@Test(priority=1)
	void Search()
	{
		System.out.println("Search Elements...");
	}
	@Test(priority=2)
	void AdvSearched()
	{
		System.out.println("Advanced Search Elements....");
	}
	@AfterMethod
	void Logout()
	{
		System.out.println("Logout succesfully....");
	}
	

}
