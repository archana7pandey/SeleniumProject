package seleniumPackage;

import org.testng.annotations.Test;

public class TestNG_TestCase2 {

	//Creating method for test and priority annotation of testNG
	
/*	@Test(priority=1)
	public void composemail()
	{
		System.out.println("composemail");
	}
	
	@Test(priority=3)
	
	public void deleteemail()
	{
		System.out.println("deleteemail");
	}
	
	@Test(priority=2)
	
	public void modifyemail()
	{
		System.out.println("modifyemail");
	}*/
	//Creating method for dependsOnMethods annotation of testNG
	
	@Test(dependsOnMethods={"login"})
	public void writeemail()
	{
		System.out.println("writeemail");
	}
	
	@Test
	public void login()
	{
		System.out.println("login");
	}
	
	
	@Test
	public void draftemail()
	{
		System.out.println("draftemail");
	}
	@Test
	public void spamemail()
	{
		System.out.println("spamemail");
	}
	
	
}
