package session47_PageObjectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_PageObjectClass {
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void testlogin() throws InterruptedException
	{
		/*driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();*/
		
		PageObjectClass2 pg=new PageObjectClass2(driver);
		Thread.sleep(3000); 
		pg.username("Admin");
		pg.password("admin123");
		pg.login();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}

}
