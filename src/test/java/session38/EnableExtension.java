package session38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtension {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
	/*	File crx=new File("C:\\Users\\B.Prashanth Kumar\\OneDrive\\Desktop\\Tech Data\\SelectorsHub - XPath Helper - Chrome Web Store 5.3.3.0.crx");
	    options.addExtensions(crx);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize(); */
		
File ublock=new File("C:\\Users\\B.Prashanth Kumar\\OneDrive\\Desktop\\Tech Data\\uBlock Origin Lite - Chrome Web Store 2024.9.12.1004.crx");
options.addExtensions(ublock);
WebDriver driver=new ChromeDriver(options);
driver.get("https://text-compare.com/");
driver.manage().window().maximize();
	}
	

}
