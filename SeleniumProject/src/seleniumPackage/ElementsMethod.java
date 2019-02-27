package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("http://www.newtours.demoaut.com/");
      driver.manage().window().maximize();                //maximize the screen
      //find home link and click on it
      
      driver.findElement(By.linkText("Home")).click();;
		
      driver.findElement(By.name("userName")).sendKeys("Archana");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.name("userName")).clear();
	  
	  driver.findElement(By.linkText("Home")).isDisplayed(); //true
	  driver.findElement(By.linkText("Home")).isEnabled();   //true
	  driver.findElement(By.linkText("Home")).click();
	  
      
      //Above methods By using Webelement////////////////////
      
      WebElement e;
      
      e=driver.findElement(By.name("userName"));
      System.out.println(e.isEnabled());
      System.out.println(e.isDisplayed());
      e.sendKeys("Archana Pandey");
      System.out.println(e.getText());
                
      System.out.println(e.getAttribute("type"));
      Thread.sleep(2000);
      e.clear();
      driver.close();
      
      
	  
	  
	}

}
