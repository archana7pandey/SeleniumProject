package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGClass {
@Test 
public void VerifyTitle()
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	String strtitle= driver.getTitle();
	System.out.println(strtitle);
	driver.close();
}

@Test 
	public void checkbox() throws InterruptedException
	{
			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/AAAA/Desktop/DP_Docs/Archana EAD Applicaiton/Selenium/SELENIUM.HTML");
		WebElement e;
		
		e=driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td[2]/input[1]"));
		
		System.out.println(e.isSelected());  //false
		
		Thread.sleep(2000);
		e.click();                            //true
		Thread.sleep(2000);
		System.out.println(e.isSelected());  //true
			
		driver.close();
		
				
	}
	
@Test 
	public void search()
	{
		System.out.println("search");
	}
	
}
