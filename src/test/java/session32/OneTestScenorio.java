package session32;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class OneTestScenorio {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='Mexico City']")).click();
		driver.findElement(By.xpath("//option[@value='Rome']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//String value=driver.findElement(By.xpath("//table[@class='table']//tbody//tr[1]/td[1]")).getText();
		//String value=driver.findElement(By.xpath("//table[@class='table']//tbody//tr[1]/td[2]")).getText();
		//System.out.println(value);
		int x=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		//System.out.println("Number of Rows:"+x);
		int y=driver.findElements(By.xpath("//table[@class='table']//thead//tr//th")).size();
		//System.out.println("Number of Columns:"+y);
		/*for(int i=1;i<=x;i++)
		{
			for(int j=2;j<=y;j++)
			{
				String values=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(values+"\t");
				
			}
			System.out.println();
		}*/
		
		for(int j=1;j<y;j++)
		{
			String values=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+j+"]//td[6]")).getText();
			//String a[]= {values};
			
			if(values.equals("$200.98"))
			{
				Thread.sleep(3000);
				//System.out.println(values);
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr[1]//td[1]//input[@value='Choose This Flight']")).click();
				break;
				
				
			}
			
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='inputName']")).sendKeys("Prashanth");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("FlowerBazar");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Adoni");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Andhra Pradesh");
		driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("518301");
		driver.findElement(By.xpath("//select[@name='cardType']")).click();
		driver.findElement(By.xpath("//input[@name='creditCardNumber']")).sendKeys("409-289-098-309");
		//driver.findElement(By.xpath("//input[@name='creditCardMonth']")).sendKeys("10");
		//driver.findElement(By.xpath("//input[@name='creditCardYear']")).sendKeys("2020");
		driver.findElement(By.xpath("//input[@name='nameOnCard']")).sendKeys("Bandi Prashanth Kumar");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		Thread.sleep(5000);
		String confirm=driver.findElement(By.xpath("//div[@class='container hero-unit']//h1")).getText();
		System.out.println(confirm);
		//Thread.sleep(2000);
		driver.quit();
		

	}

}
