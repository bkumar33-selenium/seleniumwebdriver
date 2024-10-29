package firsttest;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatersPart1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("search")).sendKeys("Mac");
		//boolean Logo=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(Logo);
		//driver.findElement(By.linkText("Tables")).click();
		//driver.findElement(By.partialLinkText("blets")).click();
		//List<WebElement> headerTabs=driver.findElements(By.className("list-inline-item"));
		//System.out.println(headerTabs.size());
		//List<WebElement> links=driver.findElements(By.tagName("a")); 
		//System.out.println(links.size());
		WebElement web=driver.findElement(By.tagName("a"));
		System.out.println(web);
	//	List<WebElement> images=driver.findElements(By.tagName("img"));
		//System.out.println(images.size());
		

	}

}
