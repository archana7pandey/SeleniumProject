package seleniumPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataProviderTest {

	@Test(dataProvider="testdata")
	public void TestCaseLogin(String username,String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.close();
	}
	
	
	
	
	@DataProvider(name="testdata")
	
	public Object[][] readExcel() throws BiffException, IOException
	{
	File f=new File("C:/Users/AAAA/Desktop/MercuryLogin.xls");	
	Workbook w=Workbook.getWorkbook(f);
	Sheet s=w.getSheet("Sheet1");
	int rows=s.getRows();
	int cols=s.getColumns();
	
	System.out.println(rows);
	System.out.println(cols);
	
	String inputdata[][]=new String [rows][cols];
	//read the data
	
	for(int i=0;i<rows;i++)
		//for(int i=1;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			Cell c= s.getCell(j, i);
			inputdata[i][j]=c.getContents();
		}
	}
	
	return inputdata;
	
	}
	
	
}
