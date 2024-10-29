package firsttest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownScenorios {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Alloptions=driver.findElement(By.xpath("//select[@name='country']"));
		//driver.findElement(By.xpath("//option[@value='1']")).click();
		Select options=new Select(Alloptions);
		//options.selectByIndex(1);
		//options.selectByValue("China");
		//options.selectByVisibleText("India");
		List<WebElement> Alloptions1=options.getOptions();
		System.out.println(Alloptions1.size());
     for(WebElement s:Alloptions1)
     {
    	System.out.println(s.getText());
     }
	}

}
