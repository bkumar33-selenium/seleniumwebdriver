
// HardAssertions
package session43_2;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertion2 {
	@Test
	void testAssert()
	{
	//Assert.assertEquals("abc1","abc");//fail
	//	Assert.assertNotEquals("x","y"); //passed
		
	//	Assert.assertTrue(1==2);//failed
	//	Assert.assertTrue(1==1);//passes
		
	//Assert.assertTrue(true);//passed
		//Assert.assertTrue(false);//failed
		
	//	Assert.assertFalse(true);//failed
	//	Assert.assertFalse(false);//passed
		
	//	Assert.assertFalse(1==1);//failed
	//	Assert.assertFalse(1==2); //passed
		Assert.fail();
  	 
	}

}
