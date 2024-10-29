package session47_PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass2 {
	
	WebDriver driver;
	//Constructor
	PageObjectClass2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locaters
	/*By loc=By.xpath("//input[@placeholder='username']");
    By pw=By.xpath("//input[@placeholder='password']");
    By lg=By.xpath("//button[normalize-space()='Login']");
    */
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement un;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement pw;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement login;
    //Action Methods
    public void username(String Un)
    {
    	un.sendKeys(Un);
    }
    public void password(String pwd)
    {
       pw.sendKeys(pwd);
    }
    public void login()
    {
    	login.click();
    }

}



