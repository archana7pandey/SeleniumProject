package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("searchBtn")).click();
		//Handling pop/Alert
		//focus is changed
		Alert alt=driver.switchTo().alert();
		String strtxt=alt.getText();
		System.out.println("Text is :->"+strtxt);
	    //click on ok button
		alt.accept();
		
		//NoAlertPresentException
		//alt.dismiss();
		
		
	}

}
