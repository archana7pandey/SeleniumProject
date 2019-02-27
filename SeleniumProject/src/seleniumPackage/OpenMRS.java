package seleniumPackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class OpenMRS {
	 WebDriver driver;
	
	 @Parameters({"browserType"})
	 @BeforeClass
	
	 public void invokeBrowser(String browserType)
	 {
		 if(browserType.equals("FF"))
		 {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
			
		 }
		 else if(browserType.equals("CH"))
		 {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver=new InternetExplorerDriver();
				
		 }	 
		 
		 else
		 {
			 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver=new ChromeDriver();
				
			 
		 }
	 }
	 
@Test

public void verifyDealCount()
{
	openApp();
	navigateToPage("Valentine");
	int actual=retrieveDealCount("Great Deals on Jewelry");
	int expected=8;
	Assert.assertEquals(actual, expected);
	
}

public void openApp()
{
	driver.get("https://www.retailmenot.com");
	
}
	public void navigateToPage(String linkText)
	{
		//driver.findElement(By.xpath("//span[contains(text(),'Valentine')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'"+linkText+"')]")).click();
	}

	public int retrieveDealCount(String dealname)
	{
		List<WebElement> lst=driver.findElements(By.xpath("//h3[text()='"+dealname+"']/ancestor::div[contains(@class,'section-header')]/following-sibling::div/div"));
		System.out.println("Number of Elements in the List "+lst.size());
		for(int i=0;i<lst.size();i++)
		{
			System.out.println("*******************************************");
			System.out.println("Fetching the Details of the Deal "+(i+1));
			System.out.println(lst.get(i).getText());
			System.out.println("*******************************************");
		}
		
		return lst.size();
		
	}
}
