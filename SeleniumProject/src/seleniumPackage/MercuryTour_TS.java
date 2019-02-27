package seleniumPackage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTour_TS {
	static WebDriver driver=new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   login();
	   FindFlight();
	 //  Register();
	
		
	}
	
	
public static void login() {
		
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Flights")).click();
	
	}

public static void FindFlight() {
	
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@value='oneway']")).click(); 
	//driver.findElement(By.xpath("//input[@value='roundtrip']"));   
	
	Select lstpass=new Select (driver.findElement(By.xpath("//select[@name='passCount']")));
	
	lstpass.selectByIndex(1);  //2
	
	//list.selectByVisibleText("2");
	

	Select lstport=new Select (driver.findElement(By.xpath("//select[@name='fromPort']")));
	lstport.selectByIndex(3);  //NY
	
		
	Select lstfrm_m=new Select (driver.findElement(By.xpath("//select[@name='fromMonth']")));
	lstfrm_m.selectByIndex(6);  //July
	
	Select lstfrm_d=new Select (driver.findElement(By.xpath("//select[@name='fromDay']")));
	lstfrm_d.selectByVisibleText("25"); //25
	
	Select lsttoPort=new Select (driver.findElement(By.xpath("//select[@name='toPort']")));
	lsttoPort.selectByIndex(4);  //paris
	
	Select lstTo_m=new Select (driver.findElement(By.xpath("//select[@name='toMonth']")));
	lstTo_m.selectByVisibleText("July");  //July

	
	Select lstTo_d=new Select (driver.findElement(By.xpath("//select[@name='toDay']")));
	lstTo_d.selectByVisibleText("26");  //26
			
	//driver.findElement(By.xpath("//input[@value='Coach']")); 
	driver.findElement(By.xpath("//input[@value='Business']")).click(); 
	//driver.findElement(By.xpath("//input[@value='First']")); 
	
	Select lstairline=new Select (driver.findElement(By.xpath("//select[@name='airline']")));
	lstairline.selectByIndex(2);  //blue sky
	
	
	driver.findElement(By.name("findFlights")).click();
	
	 BookFlight();
	
	
}
	
	public static void Register() {
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Archana");
		driver.findElement(By.name("lastName")).sendKeys("Pandey");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.id("userName")).sendKeys("archana7pandey@gmail.com");
		driver.findElement(By.id("email")).sendKeys("archana7pandey@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mercury123");
		driver.findElement(By.name("confirmPassword")).sendKeys("mercury123");
		driver.findElement(By.name("register")).click();
		
	}

	
	public static void BookFlight() {
		
		//*form[1]/table[1]///tr[5]/td[1]/input[1]
		driver.findElement(By.xpath("//form[1]/table[1]//tr[5]/td[1]/input[1]")).click();
		driver.findElement(By.xpath("//table[2]/tbody[1]/tr[7]/td[1]")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
		//fill the form
		
		driver.findElement(By.name("passFirst0")).sendKeys("Archana");
		driver.findElement(By.name("passLast0")).sendKeys("Pandey");
		Select lst_meal=new Select (driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
		lst_meal.selectByVisibleText("Vegetarian");  //Vegetarian

		driver.findElement(By.name("passFirst1")).sendKeys("Ajay");
		driver.findElement(By.name("passLast1")).sendKeys("Pandey");
		Select lst_meal1=new Select (driver.findElement(By.xpath("//select[@name='pass.1.meal']")));
		lst_meal1.selectByVisibleText("Vegetarian");  //Vegetarian

		Select lst_cc=new Select (driver.findElement(By.xpath("//select[@name='creditCard']")));
		lst_cc.selectByVisibleText("Visa"); 
		
		driver.findElement(By.name("creditnumber")).sendKeys("1234567890");
		
		driver.findElement(By.name("billAddress1")).sendKeys("RED BLOSSOM WAY");
	
		
		List<WebElement> lstchk=driver.findElements(By.name("ticketLess"));
		
		for(int i=0;i<lstchk.size();i++)
		{
			
			//System.out.println(" value "+i);
			
			if(i==1)	
			{
				lstchk.get(i).click();
				break;
			}
		}
		
		
		
		driver.findElement(By.name("buyFlights")).click();
		
		
	}

	
	
}
