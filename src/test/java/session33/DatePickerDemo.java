package session33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	/*static void selectYandM(WebDriver driver,String month,String year)
	{
		while(true)
		{
			
		String getmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String getyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(getyear.equals(year) && getmonth.equals(month))
		{
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	}
	static void selectDate(WebDriver driver,String date)
	{
		List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[@class='ui-state-default']"));
		for(WebElement sd:dates)
		{
			if((sd.getText()).equals(date))
			{
				sd.click();
				
			}
	}
	}*/
	static void selectFutureDate(WebDriver driver,String month,String year,String date)
	{
		while(true)
		{
			
		String getmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String getyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(getyear.equals(year) && getmonth.equals(month))
		{
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[@class='ui-state-default']"));
		for(WebElement sd:dates)
		{
			if((sd.getText()).equals(date))
			{
				sd.click();
				
			}
		}
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click(); //sendKeys("30/08/2024");
		String month="January";
		String year="2028";
		String date="28";
		//selectYandM(driver,month,year);
		//selectDate(driver,date);
		selectFutureDate(driver,month,year,date);
		/*for(int i=1;i<25;i++)
		{
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		String getmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String getyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(getyear.equals(year) && getmonth.equals(month))
		{
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[3]//td[6]")).click();
			break;
		}
		}*/
	/*	while(true)
		{
			
		String getmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String getyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		
		if(getyear.equals(year) && getmonth.equals(month))
		{
			//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[@class='ui-state-default']"));
		for(WebElement sd:dates)
		{
			if((sd.getText()).equals(date))
			{
				sd.click();
				
			}
		}*/
		

	}

}
