package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
        driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		String actual=driver.findElement(By.className("title")).getText();
		System.out.println("Text Retrived from the WebPage :"+ actual);
		
		boolean result=actual.contains("WebDriver");
		if(result)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
