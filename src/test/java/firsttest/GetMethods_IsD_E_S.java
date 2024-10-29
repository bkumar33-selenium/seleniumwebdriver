package firsttest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods_IsD_E_S {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println("Opened URL: " +driver.getCurrentUrl());
		//System.out.println("Page Title: "+driver.getTitle());
		//String title=driver.findElement(By.className("title")).getText();
		//String title= driver.findElement(By.cssSelector("h1[class='title']")).getText();
		//String title= driver.findElement(By.cssSelector("h1.title")).getText();
		String title=driver.findElement(By.xpath("//h1[@class='title']")).getText();
		
		//webElement title=driver.find
		System.out.println("Title:"+title);
		driver.findElement(By.id("name")).sendKeys("B.Prashanth Kumar");
		driver.findElement(By.id("email")).sendKeys("prashanth.wm123@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("08512-252960");
		driver.findElement(By.id("textarea")).sendKeys("Flower Bazar,Adoni");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.cssSelector("input[value='thursday']")).click();
		//driver.findElement(By.id("country"));
		driver.findElement(By.cssSelector("option[value='india']")).click();
		driver.findElement(By.cssSelector("option[value='red']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		

	}

}
