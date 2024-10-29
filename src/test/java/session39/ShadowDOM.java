package session39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://books-pwakit.appspot.com");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//input[@autofocus type='search']")).sendKeys("Welcome");
		//Extracted from selecterHub
		//This Element is inside single shadow DOM.
	/*	String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input"));
		*/
		SearchContext shroot=driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(2000);
		shroot.findElement(By.cssSelector("#input")).sendKeys("Welcome");
		

	}

}
