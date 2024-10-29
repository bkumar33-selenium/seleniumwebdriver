package firsttest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 Test case
 1 Launch Browser
 2 Open Url https://demo.opencart.com/
 3.Validate tittle and it should be'Your Store'
 4.Close Browser
 */
public class Login {

	public static void main(String[] args) {
		
//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
driver.get("https://demo.opencart.com/");
String str=driver.getTitle();
//System.out.println(str);
if(str.equals("Your Stre"))
{
	System.out.println("Tittle match");
}
else
{
	System.out.println("Tittle does not match");
}

//driver.close();
driver.quit();
	}

}
