package session34;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_ActionsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//WebElement Desktop=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ul//li//a[@class='nav-link dropdown-toggle']"));
		WebElement Desktop =driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement Mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
				//driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']"));
		//driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ul//li//a]"));
		//driver.findElement(By.xpath("//a[@class='nav-link']"));
		//Desktop.click();
		Actions act=new Actions(driver);
		act.moveToElement(Desktop).moveToElement(Mac).click().build().perform();
		

	}

}
