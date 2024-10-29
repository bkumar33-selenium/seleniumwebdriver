package session39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int noofBrokenLink=0,workinglinks=0,emptylink=0;
		for(WebElement wlink : links)
		{
			String slink=wlink.getAttribute("href");
			if(slink==null || slink.isEmpty())
			{
				System.out.println("Link is Empty");
				emptylink++;
				continue;
			}
			try
			{
			URL linkurl=new URL(slink);
			HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
			conn.connect();
			if(conn.getResponseCode()>=400)
			{
				System.out.println(linkurl+"----> Broken Link");
				noofBrokenLink++;
				
			}
			else
			{
				System.out.println(linkurl+"----> Link is not Broken");
				workinglinks++;
			}
			}
			catch(Exception e)
			{
			}
			
			
			
		}
		System.out.println("Total Links:"+links.size());
		System.out.println("No of Working Links:"+workinglinks);
		System.out.println("No of Broken Links:"+noofBrokenLink);
		System.out.println("No of Empty Links:"+emptylink);
		driver.quit();
		
		
		
		

	}

}
