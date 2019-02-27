package seleniumPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("http://www.rediff.com");
		
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.id("query")).sendKeys("TCS");
		driver.findElement(By.className("mw001-widget-getquote-btn")).click();
		
		driver.switchTo().defaultContent();
		
	//fetching the name of window which has focus
		
		String parent=driver.getWindowHandle();

	    System.out.println("Parent window name :: "+parent); //dynamic name assign by OS
	    
	    Set<String> wSet=driver.getWindowHandles();
	    System.out.println("Size of window set or count of windows :: "+wSet.size());
	    
	    for(String s: wSet)
	    {
	    	System.out.println("wSet Values :: "+s); 
	    	
	    	if(!(s.equals(parent)))
	    	{
	    		driver.switchTo().window(s);
//	    		if(driver.getTitle().contains("Tata"))
//	    		{
//	    		String price=driver.findElement(By.id("Itpid")).getText();
//	    		System.out.println("The stock Price is = "+price); 
//	    		break;
//	    		}
	    		
	    		try
	    		{
		    		String price=driver.findElement(By.id("Itpid")).getText();
		    		System.out.println("The stock Price is = "+price); 
		    		break;

	    		}
	    		catch(Exception e)
	    		{
	    			
	    		}
	    		
	    		//try catch will take more time to execution,we should go first for title condition line 39 if page title is not there then use try catch
	    	}
	    	
	    }
	    
	    driver.switchTo().window(parent);
	    
	    
	    
		
		
	}
		
		
	

}
