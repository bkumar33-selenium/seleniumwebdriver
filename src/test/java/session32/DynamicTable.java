package session32;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DynamicTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://demo.opencart.com/admin/index.php");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		//String noOfPages=driver.findElement(By.xpath("//ul[@class='pagination']//li[3]//a")).getText();
		//System.out.println(noOfPages);
		//driver.findElement(By.xpath("//ul[@class='pagination']//li[3]//a")).click();
		int noOfPages=driver.findElements(By.xpath("//ul[@class='pagination']//li//a")).size();
		System.out.println("Number of Pages "+noOfPages);
		int noOfRows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		System.out.println("Number of Rows "+noOfRows);
		int noOfColumns=driver.findElements(By.xpath("//table[@id='productTable']//thead//tr//th")).size();
		System.out.println("Number of Columns "+noOfColumns);
		for(int j=1;j<4;j++)
		{
		String header=driver.findElement(By.xpath("//table[@id='productTable']//thead//tr//th["+j+"]")).getText();
		System.out.print(header+"   ");
		}
		System.out.println();
		for(int i=1;i<=noOfPages;i++)
		{
			System.out.println("------||PAGE-"+i+"||------");
			driver.findElement(By.xpath("//ul[@class='pagination']//li["+i+"]//a")).click();
			for(int a=1;a<=noOfRows;a++)
			{
				 for(int x=1;x<noOfColumns;x++)
				 {
				String value=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+a+"]//td["+x+"]")).getText();
				System.out.print(value+"\t");
				
				 }
				 System.out.println();
			}
			System.out.println();
		}
		

	}

}
