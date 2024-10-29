package session35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		WebElement start=driver.findElement(By.xpath("//span[@style='left: 0%;']"));
		//driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"))  -- selectHub
		WebElement end=driver.findElement(By.xpath("//span[@style='left: 100%;']"));
		System.out.println("measurments :"+start.getLocation());
		//Slider 1
		Actions act=new Actions(driver);
		act.dragAndDropBy(start, 100, 251).perform();
		//Slider2
		System.out.println("mesurments:"+end.getLocation());
		act.dragAndDropBy(end, -62, 250).perform();
	}

}
