/*
 1.Login --@BeforeClass
 2.Search -- @Test
 3.Advanced Search -- @Test
 4.Logout -- @AfterMethod
 */

package session43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAndAfterClassAnn {
	@BeforeClass
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
	@AfterClass
	void Logout()
	{
		System.out.println("Logout succesfully....");
	}
	

}
