package session42;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1.open/launch the page
 2.test logo presence
 3.login
 4.close
 */

class TestNGDemo1 {
	WebDriver driver;
	
  @Test(priority=1)
  void openPage() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }
  @Test(priority=2)
  void logoIsDisplayed() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Boolean dis=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img")).isDisplayed();
	  System.out.println(dis);  
  }
  @Test(priority=3)
  void testlogin()
  {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
 @Test(priority=4)
  void testclose()
  {
	  driver.quit();
  }
}
