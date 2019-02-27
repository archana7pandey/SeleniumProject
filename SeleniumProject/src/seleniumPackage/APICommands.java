package seleniumPackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class APICommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");   //assign  url to the browser
		driver.getCurrentUrl();      //returns the current url of the chrome browser
		
		
		String CurUrl=driver.getCurrentUrl();
		System.out.println(CurUrl);
		
		if (CurUrl.contains("https://www.google.com/"))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
		
	
		String title=driver.getTitle();    //fetch the title of the webpage
		System.out.println(title);
		if (title.equalsIgnoreCase("google"))
		{
			System.out.println("right title");
		}
		else
		{
			System.out.println("wrong title");
		}
		
		
		driver.close();
		

	}

}
