package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/AAAA/Desktop/DP_Docs/Archana EAD Applicaiton/Selenium/SELENIUM.HTML");
		WebElement e;
		
		e=driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr[2]/td[2]/input[1]"));
		
		System.out.println(e.isSelected());  //false
		
		Thread.sleep(2000);
		e.click();                            //true
		Thread.sleep(2000);
		System.out.println(e.isSelected());  //true
			
		driver.close();
		
	}

}
