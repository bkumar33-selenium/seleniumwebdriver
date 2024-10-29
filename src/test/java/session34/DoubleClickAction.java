package session34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("WELCOME");
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement copyText=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		//String f2=field2.getText();
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.doubleClick(copyText).perform();
		String f2=field2.getAttribute("value");
		System.out.println("value from field2 :"+f2);
		if(field2.getText().equals("WELCOME"))
				{
			System.out.println("Text Copied......");
				}
		else
		{
			System.out.println("Text Not Copied.....");
		}

	}

}
