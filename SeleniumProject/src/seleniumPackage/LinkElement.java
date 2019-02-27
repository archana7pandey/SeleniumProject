package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com");
		
		driver.manage().window().maximize();
		WebElement e;
        e=driver.findElement(By.linkText("Trouble signing in?"));
        System.out.println(e.isDisplayed());
		System.out.println(e.isEnabled());
		e.click();
		driver.close();
		
		
	  WebDriver driver1=new ChromeDriver();
	  driver1.get("https://www.seleniumhq.org/");
	  String title=driver1.getTitle();
	  driver1.manage().window().maximize();
	  WebElement e1;
	  e1=driver1.findElement(By.partialLinkText("Long Live Selenium IDE!"));
	  System.out.println(e1.isDisplayed());
	  System.out.println(e1.isEnabled());
	  e1.click();
	  String title1=driver1.getTitle();
	  System.out.println(title);
	  System.out.println(title1);
	  
	  driver1.close();

	}

}
