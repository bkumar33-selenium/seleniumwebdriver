package firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingForProj {

	public static void main(String[] args) {
		
		//ChromeDriver driver=new ChromeDriver();
				WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.xpath("//span[@class='hidden-xs hidden-sm hidden-md']"));
		String s=we.getText();
		System.out.println(s);
		we.click();
		
		//String str=driver.getTitle();
		//System.out.println(str);
		/*if(str.equals("Your Stre"))
		{
			System.out.println("Tittle match");
		}
		else
		{
			System.out.println("Tittle does not match");
		}
*/
		//driver.close();
		//driver.quit();
			}

		}


