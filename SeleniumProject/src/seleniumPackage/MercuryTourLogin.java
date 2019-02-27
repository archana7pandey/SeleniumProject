package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTourLogin {

	public void Login(String username,String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MercuryTourLogin obj=new MercuryTourLogin();
		obj.Login("username1", "pwd123");
				
		
		
	}

}
