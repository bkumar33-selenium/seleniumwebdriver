package session37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavascriptExc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement input=driver.findElement(By.xpath("//input[@id='name']"));
		WebElement click=driver.findElement(By.xpath("//input[@value='female']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Prashanth')",input);
		js.executeScript("arguments[0].click()",click);
		
		
	}

}
