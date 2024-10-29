package session34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_RightclickAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jquery-contextMenu/demo.html");
		driver.manage().window().maximize();
		//WebElement ele=driver.findElement(By.xpath(null)) ;
		Actions act=new Actions(driver);
		//act.contextClick(ele).perform();
		WebElement copy=driver.findElement(By.xpath(null));
		driver.switchTo().alert().accept();
		
		//Create an action 
		Action per=act.contextClick().build();
		//and perform seperately
		per.perform();

	}

}
