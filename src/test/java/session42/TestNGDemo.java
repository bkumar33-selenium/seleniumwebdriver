package session42;

import org.testng.annotations.Test;

//1.open page
//2.login
//3.logout

public class TestNGDemo {
	
	@Test(priority=1)
	//@Test(priority=300)
	void openpage()
	{
		System.out.println("Opened Page.....");
	}
	@Test(priority=2)
	//@Test(priority=180)
	void login()
	{
		System.out.println("login to application....");
	}
	@Test(priority=3)
	//@Test(priority=350)
	void logout()
	{
		System.out.println("logout to application....");
	}

}
