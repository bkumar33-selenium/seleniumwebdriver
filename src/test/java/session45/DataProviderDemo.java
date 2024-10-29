package session45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	@BeforeClass
	void testdriver()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider="dp")
	void testlogin(String email,String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Thread.sleep(2000);
		//boolean status=driver.findElement(By.xpath("//div[@id='content']//h2")).isDisplayed();
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true)
		{
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='list-group']//a[13]")).click();
			System.out.println("test");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
	}
	@AfterClass
	void testlogout()
	{
		driver.close();
	}
	@DataProvider(name="dp",indices= {0,3})
	Object[][] testInputs()
	{
		Object s[][]= {{"xavanol123@gmail.com","test@123"},
				{"xavanol123@gmail.com","test@123"},
		          {"pavanol123@gmail.com","test@123"},
		          {"zavanol123@gmail.com","test@123"}};
		return s;
				      
		}
	}


