package session41;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DataDriverTest_ExcelData {

	public static void main(String[] args) {
	//	ChromeOptions option=new ChromeOptions();
		//option.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter principal:");
		//int prin=s.nextInt();
		String prin=s.next();
		System.out.println("Enter interest rate:");
		String intr=s.next();
		System.out.println("Enter Tenure");
		//int ten=s.nextInt();
		String ten=s.next();
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='principal']")).sendKeys(prin);
		driver.findElement(By.xpath("//input[@name='interest']")).sendKeys(intr);
		driver.findElement(By.xpath("//input[@name='tenure']")).sendKeys(ten);
		WebElement tenure=driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
		Select list=new Select(tenure);
		list.selectByVisibleText("year(s)");
		WebElement freq=driver.findElement(By.xpath("//select[@id='frequency']"));
		Select flist=new Select(freq);
		flist.selectByVisibleText("Compounded Yearly");
		WebElement wm=driver.findElement(By.xpath("//div[@class='cal_div']//a[1]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", wm);
		System.out.println("Principal Amount:"+prin);
		System.out.println("Interest Percentage:"+intr);
		System.out.println("Tenure(No.of Years):"+ten);
		String totalamnt=driver.findElement(By.xpath("//span[@class='gL_27']//strong")).getText();
		String totalInterestErned=driver.findElement(By.xpath("//span[@class='gL_14']//em")).getText();
		//totalInterestErned.split("R");
		
		String arr[]=totalInterestErned.split("d");
		
		
		System.out.println("Maturity Amount:"+totalamnt);
		//System.out.println(totalInterestErned);
		System.out.println("Total Interest Erned:"+arr[1]);
	
		driver.quit();

	}

}
