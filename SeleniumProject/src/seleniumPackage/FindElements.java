package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//open chrome brower and open amazon signup page
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&ignoreAuthState=1&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%2F130-8985984-7446348%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&prevRID=BDGPFXKG6V473NWCTC9P&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&ref_=ap_sw_aa&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&disableLoginPrepopulate=1&switch_account=signin&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		Thread.sleep(1000);
		//find the textbox for yourname and enter "archana Pandey"
		driver.findElement(By.id("ap_customer_name")).sendKeys("archana Pandey");
		
		//find the textbox for Email and enter "archana7Pandey@gmail.com"
		driver.findElement(By.name("email")).sendKeys("archana7Pandey@gmail.com");
	    
		//find the textbox for Password and enter "archana000"
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("archana000");
		
		
		//find the textbox for Re-enter Password and enter "archana000"
		driver.findElement(By.cssSelector("#ap_password_check")).sendKeys("archana000");
		
		//find the button for Create your Amazon account and click on it
		driver.findElement(By.id("continue")).click();
		
		// Navigate to another url https://www.google.com
		
		driver.navigate().to("https://www.google.com");
		
		//back to amazon url
		//Thread.sleep(1000);
		driver.navigate().back();
		
		// farward to google page
		
		//Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		System.out.println("test case is completed");
	
	}

}
