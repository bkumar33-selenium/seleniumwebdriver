package session44;

import org.testng.annotations.Test;

public class PaymentMeth {
	@Test(priority=1,groups= {"Sanity","Regression","Functional"})
	void PaymentByFaceBook()
	{
		System.out.println("PaymentByFaceBook");
	}
	@Test(priority=2,groups= {"Sanity","Regression","Functional"})
	void PaymentByTwitter()
	{
		System.out.println("PaymentByTwitter");
	}

}
