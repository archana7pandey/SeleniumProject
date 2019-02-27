package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/AAAA/Desktop/DP_Docs/Archana EAD Applicaiton/Selenium/SELENIUM.HTML");
		
		Boolean s= driver.findElement(By.xpath("//*[@id='R1']")).isSelected();
		
		Boolean s1= driver.findElement(By.xpath("//*[@id='R1']")).isDisplayed();
		
		Boolean s2= driver.findElement(By.xpath("//*[@id='R1']")).isEnabled();
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		
		driver.findElement(By.xpath("//*[@id='R1']")).click();
		
		Boolean s3= driver.findElement(By.xpath("//*[@id='R1']")).isSelected(); 
		Thread.sleep(5000);
		System.out.println(s3);
		
		driver.close();
		
	}

}
