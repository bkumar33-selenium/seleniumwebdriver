package firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesiframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		//frame[@src='frame_1.html']
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("Prashanth");
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Sridhar");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		

	}

}
