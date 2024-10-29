package firsttest;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchtoOtherPage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowsIDs=driver.getWindowHandles();
		//System.out.println(driver.getTitle());
		List<String> IDs=new ArrayList(windowsIDs);
		/*String parentId=IDs.get(0);
		String childId=IDs.get(1);
		//Switch to child
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		//Switch to parant
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		*/
		
		for(String id:IDs)
		{
			String title=driver.switchTo().window(id).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM"))
			{
				driver.close();
		
			}
			else 
			{
				
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		
		

	}

}
