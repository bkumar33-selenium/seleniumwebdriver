package firsttest;

import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xpath.internal.operations.And;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatersPart3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Find something");
		//driver.findElement(By.xpath("//*[@name='search']")).sendKeys("searching....");
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search'] ")).sendKeys("searching");
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("searching....");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("looking into ...."); 
		//driver.findElement(By.xpath("//[text()='MacBook']")).click();
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		//boolean tagnam=driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
		//System.out.println(tagnam);
		//String str= driver.findElement(By.xpath("//*[text()='Featured']")).getText();
		//System.out.println(str);
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("contains");
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Contains");
		//driver.findElement(By.xpath("//div[@class='col-md-5']/div/input")).sendKeys("searching...");
		
	}

}
