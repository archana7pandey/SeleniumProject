package seleniumPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptEx {

	public static void main(String[] args)
	{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		String str=(String) jse.executeScript("return document.title");
		System.out.println(str);
		
		WebElement e=(WebElement) jse.executeScript("return document.getElementByname('q')[0]");
		e.sendKeys("Selenium");
	}
	
	
	
}
