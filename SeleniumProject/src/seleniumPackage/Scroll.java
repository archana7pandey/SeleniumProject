package seleniumPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		js.executeScript("scroll(0,1200)", ""); //for scroll down
		
		//for scroll up js.executeScript("scroll(0,-1200)", "");
		
		
		
	}

}
