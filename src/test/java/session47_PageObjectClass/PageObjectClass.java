package session47_PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectClass {
	WebDriver driver;
	//Constructor
	PageObjectClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locaters
	By loc=By.xpath("//input[@placeholder='Username']");
    By pw=By.xpath("//input[@placeholder='Password']");
    By lg=By.xpath("//button[normalize-space()='Login']");
    
    //Action Methods
    public void username(String Un)
    {
    	driver.findElement(loc).sendKeys(Un);
    }
    public void password(String pwd)
    {
       driver.findElement(pw).sendKeys(pwd);
    }
    public void login()
    {
    	driver.findElement(lg).click();
    }

}
