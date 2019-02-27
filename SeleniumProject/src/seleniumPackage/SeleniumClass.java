package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		

		//This script is for to check the connection between selenium client(WebDriver) and selenium server
		// we will open chrome and firefox brower and open webpage of selenium Hq
		
		
		//syntax to open the driver//////
		
		System.setProperty("WebDriver.chrome.driver", "C:/chromedriver.exe");
		System.setProperty("WebDriver.gecko.driver", "C:/geckodriver.exe");
		
		//WebDriver command to open the driver
		WebDriver driver=new ChromeDriver();          //WebDriver is a class in selenium
		
		WebDriver driver1=new FirefoxDriver(); 
		
		// command to enter url and open the webpage//
		driver.get("https://www.seleniumhq.org/");
		
		driver1.get("https://www.seleniumhq.org/");
		
		
	}

}
