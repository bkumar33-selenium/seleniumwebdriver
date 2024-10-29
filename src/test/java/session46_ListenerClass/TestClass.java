package session46_ListenerClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners
public class TestClass {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	void testlogo() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isDisplayed();
		//System.out.println(status);
		Assert.assertEquals(status,true);
	}
	@Test(priority=2)
    void testUrl()
    {
    	Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/login");
    }
	@Test(priority=3,dependsOnMethods="testUrl")
    void testTitle()
    {
    	Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
	@AfterClass
    void testclose()
    {
    	driver.quit();
    }
}
