package firsttest;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdownvalue=driver.findElement(By.id("country"));
		Select dropdown=new Select(dropdownvalue);
		//dropdown.selectByVisibleText("France");
		//dropdown.selectByValue("canada");
		//dropdown.selectByIndex(4);
		List<WebElement> dropdownopt=dropdown.getOptions();
		System.out.println("Number of Options :"+dropdownopt.size());
		/*for(WebElement w:dropdownopt)
		{
			System.out.println(w.getText());
		}*/
		for(int i=0;i<dropdownopt.size();i++)
		{
			System.out.println(dropdownopt.get(i).getText());
		}
		
		
	

}
}
