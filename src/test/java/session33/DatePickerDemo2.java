package session33;

import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
	static Month convertmonth(String month)
	{
		HashMap<String,Month> conmonth=new HashMap<String,Month>();
		conmonth.put("January", Month.JANUARY);
		conmonth.put("February", Month.FEBRUARY);
		conmonth.put("March", Month.MARCH);
		conmonth.put("April", Month.APRIL);
		conmonth.put("May", Month.MAY);
		conmonth.put("June", Month.JUNE);
		conmonth.put("July", Month.JULY);
		conmonth.put("August", Month.AUGUST);
		conmonth.put("September", Month.SEPTEMBER);
		conmonth.put("October", Month.OCTOBER);
		conmonth.put("November", Month.NOVEMBER);
		conmonth.put("December", Month.DECEMBER); 
		
		Month omonth=conmonth.get(month);
		
		if(omonth==null)
		{
			System.out.println("Invalid Month...");
		}
			return omonth;
		
	}
		
	
	

	public static void main(String[] args) 
	{
		String reqyear="2022";
		String reqmonth="May";
		String reqday="13";
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame-one796456169']"));
		driver.switchTo().frame("frame-one796456169");	
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		//WebElement yearsList=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		//Select dropdown=new Select(yearsList);
		//dropdown.selectByVisibleText("2023");
	
		String curmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		while(true)
		{
			Month displaymonth=convertmonth(curmonth);
			Month expectedmonth=convertmonth(reqmonth);
			int result=expectedmonth.compareTo(displaymonth);
			if(result>1)
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}else if(result<1)
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}if(result==0)
			{
				break;
			}
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("//tableu[@class='i-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement d:dates)
		{
			if(d.getText().equals(reqday))
			{
				d.click();
				break;
			}
		}
		
		

	}

}
