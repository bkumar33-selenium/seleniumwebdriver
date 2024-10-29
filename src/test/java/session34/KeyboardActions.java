package session34;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://text-compare.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@placeholder='Paste one version of a text here.']")).sendKeys("Welcome");
		//driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		Actions act=new Actions(driver);
		//control A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		//control C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		//Press TAB
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		//control V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}
