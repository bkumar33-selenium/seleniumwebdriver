package session35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterNewTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.opencart.com/");
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://orangehrm.com");
		

	}

}
