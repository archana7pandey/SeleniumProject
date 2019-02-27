package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException
	{
		Assignment1 obj=new Assignment1();
		obj.DynamicList();
		
	
	}
     public void DynamicList() {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.yahoo.com/");
			
			WebElement e;
			
		try{
			
			e=driver.findElement(By.id("uh-search-box"));	
			e.sendKeys("Selenium");
			//Thread.sleep(3000);           //required becoz scripts need time to read all suggestions
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			List<WebElement> lst=driver.findElements(By.className("yui3-aclist-item"));
			
			System.out.println("Total number of suggestions:"+lst.size());
			
			for(int i=0;i<lst.size();i++)
			{
				
				System.out.println(lst.get(i).getText());
				if(lst.get(i).getText().contains("interview questions"))
					{
						lst.get(i).click();
						break;
					}
					
			 }
		   }
			catch(Exception e1)
			{
				System.out.println(e1.getMessage());
			}
		}
	}
	

