package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		//Switch to frame
		
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		action.contextClick(driver.findElement(By.id("draggable")));
		action.moveToElement(driver.findElement(By.id("droppable")));
		action.release(driver.findElement(By.id("draggable")));
		action.perform();
		//Mouse Action Logic
		
		String actual=driver.findElement(By.xpath(".//*[@id='droppable']/p")).getText();
		System.out.println("Actual text  --> "+actual);
		String actualcolor=driver.findElement(By.id("droppable")).getCssValue("background-color");
		System.out.println("Actual Colour  --> "+actualcolor);
		driver.switchTo().defaultContent();
	}

}
