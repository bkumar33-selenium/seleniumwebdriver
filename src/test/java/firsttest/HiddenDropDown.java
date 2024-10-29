package firsttest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		//driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		//driver.findElement(By.xpath("//div[@class='oxd-select-text-input' and @tabindex='0']")).click();

	//	driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']"));
	//	driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']")).click();
		//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Account Assistant')]")).click();
		
		//driver.findElement(By.xpath("//span[normalize-space()='Account Assistant']")).click();
	//	List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
	//	System.out.println(options.size());
		
		//Example:
		driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(options.size());
		for(WebElement s:options)
		{
			System.out.println(s.getText());
		}
		
		

	}

}
