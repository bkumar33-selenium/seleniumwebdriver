package session43_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDem {
	@Test
	void testAssert()
	{
		String s1="Javaplus";
		String s2="Javaplus";
		if(s1.equals(s2))
		{
			System.out.println("Both strings are matching....");
		}
		else
		{
			System.out.println("Strings are not matching....");
			Assert.fail();
		}
	//	Assert.assertEquals(s1,s2);
	}

}
