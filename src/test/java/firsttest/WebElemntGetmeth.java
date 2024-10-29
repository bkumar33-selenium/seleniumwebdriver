package firsttest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WebElemntGetmeth {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println("Window-ID:"+driver.getWindowHandle());
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		System.out.println("Next page window ID:"+driver.getWindowHandle());
			
		
	}

}
