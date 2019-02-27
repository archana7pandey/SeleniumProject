package seleniumPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEX {

	public static void main(String[] args)
	{
		// 10 methods
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		captureScreenshot(driver,"Google1.jpg");
		//perform operations
		captureScreenshot(driver,"Google2.jpg");
	}
	
	public static void captureScreenshot(WebDriver driver,String filename)
	
	{
		//2 methods
				TakesScreenshot tsh=(TakesScreenshot)driver;
				
				File srcfile=tsh.getScreenshotAs(OutputType.FILE);
				
				System.out.println("Path --> "+ srcfile.getAbsolutePath());
				File destFile=new File(filename);    //it will create in on our project
				try
				{
					FileHandler.copy(srcfile, destFile);
					
				} 
				catch (IOException e) 
				
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		
	}
	
	
}
