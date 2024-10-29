package session44;

import org.testng.annotations.Test;

public class loginMeth {
	@Test(priority=1,groups= {"Sanity"})
	void loginByEmail()
	{
		System.out.println("LoginByEmail");
	}
	@Test(priority=2,groups= {"Sanity"})
	void loginByFaceBook()
	{
		System.out.println("LoginByFaceBook");
	}
	@Test(priority=3,groups= {"Sanity"})
	void loginByTwitter()
	{
		System.out.println("LoginByTwitter");
	}
}
