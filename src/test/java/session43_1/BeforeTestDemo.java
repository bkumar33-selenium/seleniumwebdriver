package session43_1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class BeforeTestDemo {

		@Test(priority=1)
		void Test()
		{
			System.out.println("This is Test step ....");
		}
		@BeforeTest
		void Beforetest()
		{
			System.out.println("This is Before Test...");
		}
		
	}


