package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		//driver.switchTo().frame(1);
		//driver.findElement(By.linkText("AbstractWebDriverEventListener")).click();
		
		driver.switchTo().frame("packageListFrame");
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().defaultContent(); //important line
		Thread.sleep(2000);
		
        driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.linkText("ContextAware")).click();
		driver.switchTo().defaultContent(); 
		
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("com.thoughtworks.selenium.condition")).click();
				
		driver.close();
	}
}
