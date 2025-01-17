package firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersPart2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("B-Shirts");
		//driver.findElement(By.cssSelector("[placeholder='Search store'")).sendKeys("C-Tshirts"); 
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
		
		// css - cascading style sheet
		/* tag id  - tag#id
		 * tag class - tag.classname
		 * tag attribute - tag[attribute="value"]
		 * tag class attribute - tag.classname[attribute="value"]
		 */
		

		
	}

}
