package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiPedis_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		//click on Create account link
		driver.findElement(By.linkText("Create account")).click();
		String s=driver.getCurrentUrl();
		System.out.println(s);         //https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29
		//Add Verification Point
		if(s.contains("wikipdia.org/w/"))
		{
			System.out.println("we are on correct Page");
			
		}
		
		else
		{
			System.out.println("we are on wrong Page");
			driver.navigate().back();
			
			String s1=driver.getCurrentUrl();
			System.out.println(s1);   
			//Add Verification Point
			if(s1.contains("wikipedia.org/wiki/"))
			{
				System.out.println("we are on correct Page");
				
			}
			
			else
			{
				System.out.println("we are on wrong Page");
			
			driver.findElement(By.xpath("//*[@id='mw-content-text']/div/table[2]/tbody/tr[10]/td/span/a")).click();
			//redirect it to the www.seleniumhq.org page
			
			
			String s2=driver.getCurrentUrl();
			System.out.println(s2);
			//Add Verification Point
			if(s2.contains("seleniumhq.org"))
			{
				System.out.println("we are on correct Page");
				
			}
			
			else
			{
				System.out.println("we are on wrong Page");
			
			driver.findElement(By.xpath("//*[@id='mw-content-text']/div/table[2]/tbody/tr[10]/td/span/a")).click();
			//redirect it to the www.seleniumhq.org page
			}
		}
		driver.close();
	}
	}
}
