package session37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import session38.TakeScreenShots;

public class UploadFiles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		//below is the takeScreenShots method
	TakeScreenShots ts=new TakeScreenShots();
		ts.screen(driver,"uploadfile.png");
	
		//single file upload
		//driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Uploadfiletest\\test1.txt");
		String filename=driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
	/*	System.out.println(filename);
		if(filename.equals("test1.txt"))
		{
			System.out.println("Correct file is uploaded succesfully");
		}
		else
		{
			System.out.println("incorrect file uploaded...");
		}*/
		//multiple files upload
		//driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Uploadfiletest\\test1.txt");
		//driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Uploadfiletest\\test2.txt");
		String file1="C:\\Uploadfiletest\\test1.txt";
		String file2="C:\\Uploadfiletest\\test2.txt";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+ "\n" +file2);
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("test1.txt") && 
				driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("test2.txt"))
		{
			System.out.println("Correct files are uploaded");
		}
		else
		{
			System.out.println("Files are loaded incorrectly...");
		}
		
		

	}

}
