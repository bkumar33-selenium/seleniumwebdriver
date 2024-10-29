package firsttest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait expwait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[onclick='Click for JS Alert']")).click();
		//Thread.sleep(2000);
	/*	WebElement firstoption=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		Thread.sleep(3000);
		firstoption.click();
		Alert text1=driver.switchTo().alert();
		System.out.println(text1.getText());
		Thread.sleep(3000);
		text1.accept();
	    Thread.sleep(2000);
		WebElement secondoptions=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
		secondoptions.click();
		Alert text2=driver.switchTo().alert();
		System.out.println(text2.getText());
		Thread.sleep(2000);
		text2.dismiss();
		Thread.sleep(2000);
		secondoptions.click();
		driver.switchTo().alert();
		Thread.sleep(3000);
		text2.accept(); 
		WebElement thirdoptions=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		thirdoptions.click();
		Thread.sleep(3000);
		Alert text3=driver.switchTo().alert();
		System.out.println(text3.getText());
		text3.sendKeys("welcome");
		text3.accept();
		Thread.sleep(2000);
		driver.close();
		*/
		WebElement firstoption=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		firstoption.click();
		Alert get=expwait.until(ExpectedConditions.alertIsPresent());
		System.out.println(get.getText());
		Thread.sleep(3000);
		get.accept();
		
		
		

	}

}
