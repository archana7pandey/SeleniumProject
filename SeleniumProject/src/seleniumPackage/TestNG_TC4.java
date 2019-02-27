package seleniumPackage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_TC4 {

	
	//Creating methods for @BeforeTest ,@AfterTest annotation of testNG
	
		@Test(priority=1)
		public void Test1()
		{
			System.out.println("to compose an email");
		}
		
		@BeforeTest
		public void login()
		{
			System.out.println("login to the mailBox");
		}
		
		@Test(priority=3)
		public void del()
		{
			System.out.println("to delete an email");
		}
		
		@Test(priority=2)
		public void modify()
		{
			System.out.println("to modify an email");
		}
		
		@AfterTest
		public void logout()
		{
			System.out.println("to logout from mailbox");
		}
		
	
}
