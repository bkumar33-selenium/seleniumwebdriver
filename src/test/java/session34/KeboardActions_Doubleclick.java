package session34;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeboardActions_Doubleclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.nopcommerce.com");
		driver.manage().window().maximize();
		/*WebElement Reg=driver.findElement(By.xpath("//a[@class='ico-register']"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).perform();
		Reg.click();
		act.keyUp(Keys.CONTROL).perform();*/

	}

}
