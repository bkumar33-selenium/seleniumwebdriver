package session44;

import org.testng.annotations.Test;

public class SignUpMeth {
	@Test(priority=1,groups= {"Regression"})
	void signUpByEmail()
	{
		System.out.println("SignupByEmail");
	}
	@Test(priority=2,groups= {"Regression"})
	void signUpByFaceBook()
	{
		System.out.println("SignupByFaceBook");
	}
	@Test(priority=3,groups= {"Regression"})
	void signUpByTwitter()
	{
		System.out.println("SignupByTwitter");
	}

}
