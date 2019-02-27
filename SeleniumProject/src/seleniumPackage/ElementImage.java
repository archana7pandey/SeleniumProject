package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
		WebElement e;
		e=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/img")); //find image in yahoo.com
			System.out.println(e.isDisplayed());
			System.out.println(e.isEnabled());
			driver.close();
				
		  WebDriver driver1=new ChromeDriver();
		  driver1.get("https://www.seleniumhq.org/");
		  driver1.manage().window().maximize();
		  WebElement e1;
		  e1=driver1.findElement(By.xpath("//*[@id='choice']/tbody/tr/td[1]/center/a[1]/img")); //find image link in seleniumhq.com
		  System.out.println(e1.isDisplayed());
		  System.out.println(e1.isEnabled());
		  e1.click();
		  driver1.close();
		  
		  WebDriver driver2=new ChromeDriver();
		  driver2.get("http://www.newtours.demoaut.com/");
		  driver2.manage().window().maximize();
		  WebElement e2;
		  e2=driver2.findElement(By.name("login")); //find image button in newtours.com
		  System.out.println(e2.isDisplayed());
		  System.out.println(e2.isEnabled());
		  e2.click();
		  driver2.close();
		  
		
		
		
	}

}
