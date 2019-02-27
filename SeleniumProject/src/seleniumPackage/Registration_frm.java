package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_frm {

	static WebDriver driver=new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/?firstname=&lastname=&photo=&continents=Asia&submit=");
		
        JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		js.executeScript("scroll(0,1200)", ""); //for scroll down
	
		WebElement e= driver.findElement(By.name("firstname"));
		e.sendKeys("archana");
		System.out.println("Firstname : "+ e.getAttribute("value"));   //print textbox value
		WebElement e1=driver.findElement(By.name("lastname"));
		e1.sendKeys("pandey");
		System.out.println("Lastname : "+ e1.getAttribute("value"));
	
		driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		driver.findElement(By.xpath("//input[@id='exp-6']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/30/2019");
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		
		//upload,link 
		
		driver.findElement(By.id("photo")).sendKeys("D:\\1.png");
		
	 	driver.findElement(By.partialLinkText("Selenium Automation")).click();
		
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		
		Select lstcontinents=new Select (driver.findElement(By.xpath("//select[@id='continents']")));
		
		lstcontinents.selectByIndex(5);  //North America
		
        Select lstcmd=new Select (driver.findElement(By.xpath("//select[@id='selenium_commands']")));
		
        lstcmd.selectByIndex(4);  //web Elements 
                
        driver.findElement(By.name("submit")).click();
        
	}

}
