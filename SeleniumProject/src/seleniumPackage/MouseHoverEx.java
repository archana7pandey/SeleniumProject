package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		driver.get("C://seleniumdocs/actions.html");
		//mouseover logic
		Actions action=new Actions(driver);
		//mouse over
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='menu1']/div[1]")));
		action.perform();
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
