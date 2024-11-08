package Odyssey;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.Properties;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class OdysseyTestNg {
	XSSFSheet sheet;
	WebDriver driver;
	static Odyssey_POM POM;
	ExtentReports extent;
	ExtentTest test;
	ExtentTest test1;
	ExtentTest test3;
	
	
	public static void login(String uname,String pass) {
		POM.SendKeyMethod("login-customer[email]","id",uname);
		POM.SendKeyMethod("login-customer[password]","id",pass);
		POM.ClickMethod("/html/body/div[5]/section/header/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/button", "xpath");	
	}
	
	public static void CreateAccount(String firstName,String lastName,String uname,String pass) {
		  POM.ClickMethod("//*[@id=\"header-login-panel\"]/div/div/p[1]/button", "xpath");
		  POM.SendKeyMethod("register-customer[first_name]", "id", firstName);
		  POM.SendKeyMethod("register-customer[last_name]", "id", lastName);
		  POM.SendKeyMethod("register-customer[email]", "id", uname);
		  POM.SendKeyMethod("register-customer[password]", "id", pass);
		  POM.ClickMethod("//*[@id=\"create_customer\"]/button", "xpath");
//		  POM.ClickMethod("/html/body/div[5]/section/header/div/div/div[2]/div[2]/div/a[1]", "xpath");
	}
	
  @Test(dataProvider = "dp")
  public void f(String uname,String pass,String action,String firstName,String lastName) throws IOException, InterruptedException {
		  POM=new Odyssey_POM(driver);
		  POM.ClickMethod("//div[@class=\"header__action-item-content\"]/a[1]", "xpath");
		  if(action.equals("create")) {
			  try {
				  CreateAccount(firstName,lastName,uname,pass);
//				  login(uname,pass);
				  Thread.sleep(5000);
				  test=extent.createTest("Create Account");
				  test3=extent.createTest("logout");
				  test.pass("Created Successful");
				  Thread.sleep(1000);
				  POM.ClickMethod("//div[@class='header__action-item-content']/a[1]", "xpath");
				  Thread.sleep(2000);
				  POM.ClickMethod("//*[@class='popover__linklist']/a[4]", "xpath");
				  test3.pass("logout success");
			  }
			  catch(Exception e) {
				  test=extent.createTest("User Already Have A Account");
				  test.fail("Invalid user");
				  File ssfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  FileUtils.copyFile(ssfile, new File("Invalid_user.jpg"));
				  test.fail("Invalid user"+test.addScreenCaptureFromPath("C:\\Users\\ashwin.murugan\\eclipse-workspace\\Supertails\\Invalid_users.jpg"));
				  extent.flush();
			  }
		  }
		  if(action.equals("login")) {
			  try {
				  login(uname,pass);
				  test1=extent.createTest("Login");
				  test3=extent.createTest("logout");
				  test1.pass("login Successful");
				  POM.ClickMethod("//div[@class='header__action-item-content']/a[1]", "xpath");
				  POM.ClickMethod("//*[@class='popover__linklist']/a[4]", "xpath");
				  test3.pass("logout Success");
			  }catch(Exception e) {
				  test1=extent.createTest("User Don't have a Account");
				  test3=extent.createTest("logout");
				  test1.fail("Invalids user login");
				  test3.fail("logout Failed");
				  File ssfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  FileUtils.copyFile(ssfile, new File("Invalid_users_login.jpg"));
				  test.fail("Invalid user"+test.addScreenCaptureFromPath("C:\\Users\\ashwin.murugan\\eclipse-workspace\\Supertails\\Invalid_users_login.jpg"));
				  extent.flush();	  
			  }
		  }else {
			  
		  }
//			  throw new Exception("User Don't Have An Account");

	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  
  }


  @DataProvider
  public Object[][] dp() {
    ArrayList<Object[]> datalist=new ArrayList();
    int noofrows=sheet.getPhysicalNumberOfRows();
    System.out.println("rows:"+noofrows);
    for(int i=0;i<noofrows;i++) {
    	String uname=sheet.getRow(i).getCell(0).getStringCellValue();
    	String pass=null;
    	if(sheet.getRow(i).getCell(1).getCellType()==CellType.STRING) {
    		pass=sheet.getRow(i).getCell(1).getStringCellValue();
    	}else {
    		int p=(int)sheet.getRow(i).getCell(1).getNumericCellValue();
    		pass=Integer.toString(p);
    	}
    	String action=sheet.getRow(i).getCell(2).getStringCellValue();
    	String FirstName=sheet.getRow(i).getCell(3).getStringCellValue();
    	String LastName=sheet.getRow(i).getCell(4).getStringCellValue();
    	datalist.add(new Object[] {uname,pass,action,FirstName,LastName});
    }
    return datalist.toArray(new Object[0][]);
    
  }
  @BeforeClass
  public void beforeClass() throws IOException {
	  String url=ReadFile.Prop("url");
	  sheet=ReadFile.Excel();
	  extent=new ExtentReports();
	  ExtentSparkReporter spark=new ExtentSparkReporter("OdysseyReport1.html");
	  extent.attachReporter(spark);
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get(url);
  }

  @AfterClass
  public void afterClass() {
	  extent.flush();
	  
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
