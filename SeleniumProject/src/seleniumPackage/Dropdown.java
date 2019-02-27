package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/AAAA/Desktop/DP_Docs/Archana EAD Applicaiton/Selenium/SELENIUM.HTML");
		
		
		Select list=new Select (driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[3]/td[2]/select")));
		
		list.selectByIndex(2);  //26 to 40
		
		Thread.sleep(2000);
		
		list.selectByVisibleText("Under 16");
		

		
		List<WebElement> e = list.getOptions();
		
		int count=e.size();
		System.out.println(e.get(0));
		System.out.println(count);
		driver.close();
		
		
	}

}
