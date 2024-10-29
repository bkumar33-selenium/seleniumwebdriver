package session38;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShots {

	public void screen(WebDriver driver,String loc2)
	{
		String loc1="\\\\screenshot\\\\";
		String store=loc1+loc2;
		System.out.println(store);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File soursefile=ts.getScreenshotAs(OutputType.FILE);
		//File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\printscr1.png");
		File targetfile=new File(System.getProperty("user.dir")+store);
		//System.out.println(targetfile);
		soursefile.renameTo(targetfile);
	}
	
	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
	//driver.get("https://demo.nopcommerce.com");
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File soursefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\printscr.png");
		soursefile.renameTo(targetfile);*/
		/*WebElement framecaptur=driver.findElement(By.xpath("//div[@class='column-right-outer']//div//aside//div//div[7]"));
		//TakeScreenShots tsc=new TakeScreenShots();
			//	tsc.screen(driver,"Pprintscreen.png");
		
		File frame=framecaptur.getScreenshotAs(OutputType.FILE);
		File framec=new File(System.getProperty("user.dir")+"\\screenshot\\Framescreenshot1.png");
		frame.renameTo(framec);*/
		/*WebElement Gender=driver.findElement(By.xpath("//div[@class='post hentry uncustomized-post-template']"));
		//ystem.out.println(Gender.getText());
		File Gframe=Gender.getScreenshotAs(OutputType.FILE);		
		File frameloc=new File(System.getProperty("user.dir")+"\\screenshot\\GenderFrame.png");
		Gframe.renameTo(frameloc);*/
		WebElement logo=driver.findElement(By.xpath("//div[@class='fauxborder-left header-fauxborder-left']"));
		File log=logo.getScreenshotAs(OutputType.FILE);
		File location=new File(System.getProperty("user.dir")+"\\screenshot\\logo.png");
		log.renameTo(location);				
		

	}

}
