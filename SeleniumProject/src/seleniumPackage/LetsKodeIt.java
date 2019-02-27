package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LetsKodeIt {

	static WebDriver driver=new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		driver.findElement(By.id("benzradio")).click();

		Select lstcar=new Select (driver.findElement(By.xpath("//select[@id='carselect']")));
		
		lstcar.selectByIndex(1);  //Benz
		
		 WebElement multiple_selection = driver.findElement(By.id("multiple-select-example"));
		  Select Item = new Select(multiple_selection);
		  Item.selectByVisibleText("Apple");
		    //Item.selectByVisibleText("Orange");
		  Item.selectByVisibleText("Peach");

		
//		  List<WebElement> options = Item.getAllSelectedOptions();
//		  options.forEach(e -> System.out.println("Selected element: " +
//		  e.getText() + "[value=" + e.getAttribute("value") +  ", title=" + e.getAttribute("title") + "]"));

		  driver.findElement(By.id("bmwcheck")).click();
		  driver.findElement(By.id("hondacheck")).click();
		  
		 driver.findElement(By.id("openwindow")).click();
		//  driver.switchTo().window("https://letskodeit.teachable.com/courses");
		  driver.switchTo().defaultContent(); //important line
		  
		  
		//div[@class='course-listing-title'][contains(text(),'Selenium WebDriver With Java')]
		
	}

}
