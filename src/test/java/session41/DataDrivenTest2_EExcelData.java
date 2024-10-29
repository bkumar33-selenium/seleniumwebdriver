package session41;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTest2_EExcelData {

	public static void main(String[] args) throws IOException, InterruptedException {
	    	WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		 driver.manage().window().maximize();
		String file=System.getProperty("user.dir")+"\\ReadExcelFileData\\InterestCalculaterTest.xlsx";
		//String sheet="Sheet1";
		int rowcount=ReadWriteDataUtility.getRowCount(file,"Sheet1");
	  //  System.out.println(ReadWriteDataUtility.getCellCount(file, sheet, 3));
		//System.out.println(ReadWriteDataUtility.getCellValue(file, sheet, 0, 0));
		for (int i=1;i<=rowcount;i++)
		{
			String princ=ReadWriteDataUtility.getCellValue(file, "Sheet1", i, 0);
			String RI=ReadWriteDataUtility.getCellValue(file, "Sheet1", i, 1);
			String perd1=ReadWriteDataUtility.getCellValue(file, "Sheet1", i, 2);
			String perd2=ReadWriteDataUtility.getCellValue(file, "Sheet1", i, 3);
			String frq=ReadWriteDataUtility.getCellValue(file, "Sheet1", i, 4);
			String actv=ReadWriteDataUtility.getCellValue(file, "Sheet1", i, 5);
		/*	System.out.println(princ);
			System.out.println(RI);
			System.out.println(perd1);
			System.out.println(perd2);
			System.out.println(frq);
			System.out.println(actv);*/
			//String exptv=ReadWriteDataUtility.getCellValue(file, sheet, i, 6);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='principal']")).sendKeys(princ);
			driver.findElement(By.xpath("//input[@name='interest']")).sendKeys(RI);
			driver.findElement(By.xpath("//input[@name='tenure']")).sendKeys(perd1);
			WebElement p=driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
			Select s=new Select(p);
			s.selectByVisibleText(perd2);
			WebElement fr=driver.findElement(By.xpath("//select[@id='frequency']"));
			Select s1=new Select(fr);
			s1.selectByVisibleText(frq);
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			//JavascriptExecutor js=(JavascriptExecutor) driver;
			//js.executeScript("arguments[0].click()", wm);
			String totalamnt=driver.findElement(By.xpath("//span[@class='gL_27']//strong")).getText();
			System.out.println(totalamnt);
			if(Double.parseDouble(actv)==Double.parseDouble(totalamnt))
			{
				//String result="Passed";
				
				ReadWriteDataUtility.putCellValue(file, "Sheet1", i, 7,"Passed");
				ReadWriteDataUtility.fillGreenColor(file, "Sheet1", i, 7,"Passed");
				
			}
			else
			{
			String result="Failed";
				ReadWriteDataUtility.putCellValue(file, "Sheet1", i, 7,result);
				ReadWriteDataUtility.fillRedColor(file, "Sheet1", i, 7, result);
			}
			WebElement clear=driver.findElement(By.xpath("//img[@class='PL5']"));
			JavascriptExecutor js1=(JavascriptExecutor) driver;
			js1.executeScript("arguments[0].click()", clear);
		}
		
		driver.quit();
	}

}
