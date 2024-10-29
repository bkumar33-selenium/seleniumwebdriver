
//HardAssertion vrs SoftAssertion
package session43_2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion3 {
	@Test
	/*void testdisplay()
	{
		System.out.println("Before Asserstion1");
		System.out.println("Before Asserstion2");
		
		Assert.assertEquals(12, 123);
		
		System.out.println("After Asserstion");
		System.out.println("After Asserstion");
	}*/
 void testdisplay1()
 {
		System.out.println("Before Asserstion1");
		System.out.println("Before Asserstion2");
		
		//Assert.assertEquals(12, 123);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(12,123); //failed
		
		System.out.println("After Asserstion");
		System.out.println("After Asserstion");
		sa.assertAll(); 
 }
}
