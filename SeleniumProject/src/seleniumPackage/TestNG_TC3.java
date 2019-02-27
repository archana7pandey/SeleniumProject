package seleniumPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_TC3 {

	//Creating methods for @BeforeMethod ,@AfterMethod annotation of testNG
	
	@Test(priority=1)
	public void Test1()
	{
		System.out.println("to compose an email");
	}
	
	@BeforeMethod
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
	
	@AfterMethod
	public void logout()
	{
		System.out.println("to logout from mailbox");
	}
	
}
