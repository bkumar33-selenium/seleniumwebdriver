package firsttest;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		URL login=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(login);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		//driver.navigate().to(login);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		

	}

}
