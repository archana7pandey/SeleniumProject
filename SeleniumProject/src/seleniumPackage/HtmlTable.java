package seleniumPackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/AAAA/Desktop/DP_Docs/Archana EAD Applicaiton/Selenium/SELENIUM.HTML");
		String s= driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[4]/td[2]")).getText();
		System.out.println(s);
		
		String s1= driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[4]/td[3]")).getText();
		System.out.println(s1);
		
		String s2= driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[4]/td[1]")).getText();
		System.out.println(s2);
		
		WebElement e=driver.findElement(By.xpath("/html/body/form/table[2]"));
		System.out.println("table2 :===>"+e.getText());
		if(e.getText()!="")
		{
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		
		int r=rows.size();
		System.out.println(r);           //returns count of table rows : 4
		
        List<WebElement> cells=driver.findElements(By.tagName("td"));
		
		int c=cells.size();
		System.out.println(c);           //returns count of table cells :16
		
		
		 List<WebElement> col=driver.findElements(By.tagName("th"));
			
		 int c1=col.size();
		 System.out.println(c1);        //returns count of table columns/header   :4    
		}
		 driver.close();
		
	}

}
