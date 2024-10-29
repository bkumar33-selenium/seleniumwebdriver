package session37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//scrolling with some values only
		//js.executeScript("window.scrollBy(0,1200)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		//Scrolling with specific element
	/*	WebElement header1=driver.findElement(By.xpath("//div[@class='main section']//div[2]//h2"));
		WebElement header2=driver.findElement(By.xpath("//div[@class='main section']//div[3]//h2"));
		System.out.println(header1.getText());
		System.out.println(header2.getText());
		js.executeScript("arguments[0].scrollIntoView()", header2);
    */
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
	}

}
