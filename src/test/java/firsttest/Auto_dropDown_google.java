package firsttest;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Auto_dropDown_google {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		// WebDriver driver=new WebDriver();
          driver.get("https://www.google.com");
          driver.manage().window().maximize();
          driver.findElement(By.name("q")).sendKeys("Selenium");
          Thread.sleep(5000);
          List<WebElement> opt=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
          System.out.println(opt.size());
          for(int i=0;i<opt.size();i++)
          {
        	  String list=opt.get(i).getText();
        	 System.out.println(list);
        	 if(list=="selenium")
        	 {
        		opt.get(i).click();
        	 }
          }
       
          }
	 

}
