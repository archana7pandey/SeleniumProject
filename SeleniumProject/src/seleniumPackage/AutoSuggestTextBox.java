package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestTextBox {

	public static ChromeDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");
		boolean result=selectAValue("interview questions");
	if (result)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	}
	
	public static boolean selectAValue(String val)
	{
	WebElement	e=driver.findElement(By.id("uh-search-box"));	
	e.sendKeys("Selenium");
	
	List<WebElement> lst=driver.findElements(By.className("yui3-aclist-item"));
	
	System.out.println("Total number of suggestions:"+lst.size());
	
	for(int i=0;i<lst.size();i++)
	{
		
	// try{
			
		 
		System.out.println(lst.get(i).getText());
		if(lst.get(i).getText().contains(val))
			{
				lst.get(i).click();
				break;
			}
		
	// }
		/*catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		    lst=driver.findElements(By.className("yui3-aclist-item"));
		    i--;
		}*/
			
	 }
		
		return true;
	}

}
