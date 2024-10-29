package session45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParalellTestDemo {
	
	WebDriver driver;
	@BeforeClass
	@Parameters({"Browser"})
	void setup(String brw)
	{
		
		switch(brw)
		{
		case "chrome": driver=new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		case "firefox": driver=new FirefoxDriver();break;
		default : System.out.println("This is invalid browser");return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void testLogo() throws InterruptedException
	{
		Thread.sleep(3000);
		Boolean status=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isDisplayed();
		System.out.println(status);
		Assert.assertTrue(status, "true");
	}
	@Test
	void testTitle() throws InterruptedException
	{
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
	}
	@AfterClass
	void testClose()
	{
		driver.quit();;
	}
	

}
