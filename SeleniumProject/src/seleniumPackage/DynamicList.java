package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("java");	
		Thread.sleep(3000);           //required becoz scripts need time to read all sugeestions
		
		List<WebElement> lst=driver.findElements(By.className("sbct"));
		
		System.out.println("Total number of suggestions:"+lst.size());
		
		for(int i=0;i<lst.size();i++)
		{
			
			System.out.println(lst.get(i).getText());
			if(lst.get(i).getText().contains("javascript"))
			{
				lst.get(i).click();
				break;
			}
			
		}
		
		
	}

}
