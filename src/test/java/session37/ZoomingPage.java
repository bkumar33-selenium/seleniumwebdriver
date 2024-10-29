package session37;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ZoomingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Actions act=new Actions(driver);
		//Thread.sleep(3000);
		//act.keyDown(Keys.CONTROL).keyDown(Keys.ADD).keyDown(Keys.ADD).keyUp(Keys.ADD).keyUp(Keys.ADD).keyUp(Keys.CONTROL).perform();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='50%'"); //zoomin - 50%
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='80%'"); //zoomout - 80%

	}

}
