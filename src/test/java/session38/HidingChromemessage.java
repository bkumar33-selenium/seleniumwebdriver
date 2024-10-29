package session38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HidingChromemessage {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		String gettitle=driver.getTitle();
		
		if(gettitle.equals("Your Store"))
		{
			System.out.println("Title Passed");
		}
		else
		{
			System.out.println("Title Failed");
		}
		
		//driver.quit();

	}

}
