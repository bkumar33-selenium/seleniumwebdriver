package firsttest;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println(checkbox.size());
		//select all checkboxes
		/*for(WebElement s:checkbox)
		{
			s.click();
		}
		*/
		/*for(int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}*/
		//select last 3 checkboxes
		
	/*	for(int i=(checkbox.size()-3);i<checkbox.size();i++)
		{
			
				checkbox.get(i).click();
		}
		*/
		//select first 4 checkboxs
		for(int i=0;i<3;i++)
		{
			
			checkbox.get(i).click();
	
		}
		Thread.sleep(5000); // to see the difference
		for(int j=0;j<checkbox.size();j++)
		{
			//boolean check=checkbox.get(j).isSelected();
			
			if(checkbox.get(j).isSelected())
			{
				checkbox.get(j).click();
			}
		}
		
	}

}
