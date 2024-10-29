package session47_PageObjectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample {
	
	WebDriver driver;
	@Test(priority=1)
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		WebElement mcnt=driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
		WebElement reg=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()",mcnt);
		js.executeScript("arguments[0].click()",reg);
		
	}
}
