package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		//now an alert box will open
		Alert a = driver.switchTo().alert();
		String ErrMessage=a.getText();
		System.out.println(ErrMessage);
		a.accept();                         // click on ok or yes button
		//a.dismiss();                        // click on cancel button
		driver.close();
		
		//image,imagelink,imagebutton isdis,isenabl,clicked,link,partiallink
	
	}

}
