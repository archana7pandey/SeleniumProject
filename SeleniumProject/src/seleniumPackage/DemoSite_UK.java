package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSite_UK {
	static WebDriver driver=new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		adduser();
		
		
	}
	public static void adduser()
	{
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/login.php");
		driver.findElement(By.xpath("//a[contains(text(),'3. Add a User')]")).click();
		driver.findElement(By.name("username")).sendKeys("archana");
		driver.findElement(By.name("password")).sendKeys("archana1");
		driver.findElement(By.name("FormsButton2")).click();
		
		login();
		
	}

	
	public static void login()
	{
		driver.findElement(By.xpath("//a[contains(text(),'4. Login')]")).click();
		driver.findElement(By.name("username")).sendKeys("archana");
		driver.findElement(By.name("password")).sendKeys("archana1");
		driver.findElement(By.name("FormsButton2")).click();
	
	}
}
