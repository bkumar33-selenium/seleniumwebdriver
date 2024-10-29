package firsttest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;

public class ExpicitWait {

	public static void main(String[] args) throws InterruptedException {
		Scanner url=new Scanner(System.in);
		System.out.println("Enter URL :");
		String str1=url.next();
		System.out.println(str1);
		WebDriver driver=new ChromeDriver();
		WebDriverWait swait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//String str="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(str1);
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		WebElement login=swait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		login.sendKeys("Admin");
		
		

	}

}
