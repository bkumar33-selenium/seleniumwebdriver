package session32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/"); // https://blazedemo.com/
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of Rows"+rows);
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of columns"+columns);
		//WebElement ele=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
		//System.out.println(ele.getText());
		
		for(int a=1;a<columns;a++)
		{
			String ele=driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]//th["+a+"]")).getText();
			System.out.print(ele+"  ");
		}
		System.out.println();
		System.out.println();
		for(int i=2;i<rows;i++)
		{
			for(int a=1;a<columns;a++)
			{
				String ele=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+a+"]")).getText();
				System.out.print(ele+"\t");
			}
			System.out.println();
		}
		 
		//Print Author names and also book name of the author Mukesh
		
		/*	for(int a=2;a<rows;a++)
			{
					String ele=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+a+"]//td[2]")).getText();
				
				if(ele.equals("Mukesh"))
				{
					String ele1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+a+"]//td[1]")).getText();	
					System.out.println(ele1+"\t"+ele);
					
				}
			}*/
			
		//calculate total price of all books
	/*	int totalprice=0;
			for(int a=2;a<=rows;a++)
			{
					String ele=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+a+"]//td[4]")).getText();
				
					totalprice=totalprice+Integer.parseInt(ele);
			}
			System.out.println(totalprice);*/

	}

}
