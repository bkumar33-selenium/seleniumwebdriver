package firsttest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapdropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		//driver.findElement(By.xpath("//input[@value='Oracle']")).click();
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of options : "+options.size());
	/*	for(WebElement op:options)
		{
			System.out.println(op.getText());
		}*/
		for(WebElement op:options)
		{
			String str=op.getText();
			if(str.equals("Java") || str.equals("MySQL"))
			op.click();
		}

	}

}
