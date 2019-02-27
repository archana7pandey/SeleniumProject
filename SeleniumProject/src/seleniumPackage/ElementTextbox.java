package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
		WebElement e;
		
		e=driver.findElement(By.id("login-username"));
		e.sendKeys("aa@yahoo.com");
		System.out.println(e.isDisplayed());
		System.out.println(e.isEnabled());
		String s=e.getAttribute("type");
		System.out.println(s);
		e.clear();
		
		//Action to be performed for the button
		WebElement e1;
		e1=driver.findElement(By.id("login-signin"));
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());
		e1.click();
		String s1=e1.getAttribute("type");
		System.out.println(s1);
		
		driver.close();
		
	}

}
