package firsttest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		//driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
      //  boolean logo=driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']")).isDisplayed();
       // boolean logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        //boolean logo= driver.findElement(By.tagName("img")).isDisplayed();
       // WebElement logo=driver.findElement(By.tagName("img")).get();
        //System.out.println(logo);
      //  WebElement firstname=driver.findElement(By.name("FirstName"));
       // System.out.println(firstname.isEnabled());
      //  WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
    //    System.out.println(firstname.isEnabled());
        WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
        male.click(); 
        boolean button=driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
        System.out.println(button);
        
        
        
        
        
		
	}

}
