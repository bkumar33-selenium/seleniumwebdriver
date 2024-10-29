package firsttest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
	WebElement product1=driver.findElement(By.partialLinkText("Product 1"));
	System.out.println(product1.getText());
/*	for(WebElement w:list)
	{
		//WebElement product1=driver.findElement(By.linkText("Product 1"));
		if(product1.getText()=="Product 1")
		{
		w.click();
		}
	}*/
		//driver.findElement(By.xpath("//body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]")).click();
		//driver.findElement(By.xpath("//html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/input[1]")).click();
	}

}
