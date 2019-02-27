package seleniumPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitTime {

	@Test 
	public void TestCaseLogin()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//CODE FOR Implicit Wait/////////////////////////
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.newtours.demoaut.com/");
		
		//CODE FOR Explicit Wait/////////////////////////
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement w;
		w=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		System.out.println("waiting for sometime"+w.getText());
		
		//CODE FOR Fluent Wait/////////////////////////
		
		driver.findElement(By.name("userName")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pwd123");
		driver.findElement(By.name("login")).click();
		driver.close();
	}
	
}
