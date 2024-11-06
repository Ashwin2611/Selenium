package DataTesting;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.InputStream;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MainTest {
  WebDriver driver;
  XSSFWorkbook workbook;
  XSSFSheet sheet;
  XSSFSheet sheetTest;
  XSSFSheet sheetTeststep;
  int noofrows;
  
  public Object[][] Testdatas(int row) {
	  ArrayList<Object[]> dataList=new ArrayList();
	  for(int i=1;i<row;i++) {
		  String Testid=sheetTest.getRow(i).getCell(0).getStringCellValue();
		  String Testexe=sheetTest.getRow(i).getCell(2).getStringCellValue();
		  String Modid=sheetTest.getRow(i).getCell(3).getStringCellValue();
		  if(Testexe.equals("Y")) {
			  dataList.add(new Object[] {Testid,Testexe,Modid});  
		  }
	  }
	  return dataList.toArray(new Object[0][]);
  }
  
  public Object[][] TestStep(int row,Object[][] val){
	  ArrayList<Object[]> dataList=new ArrayList();
	  for(int i=1;i<row;i++) {
		  String funcName=sheetTeststep.getRow(i).getCell(2).getStringCellValue();
		  String keyword=sheetTeststep.getRow(i).getCell(3).getStringCellValue();
		  String testCaseId=sheetTeststep.getRow(i).getCell(4).getStringCellValue();
//		  System.out.println("TestValue:"+val.get(0)[0]);
		  if(val[0][0].equals(testCaseId)) {
			  dataList.add(new Object[] {funcName,keyword,testCaseId});
			  switch(keyword) {
			  case "ln":
				  login();
				  break;
			  case "ca":
				  close();
				  break;
			  }
		  }
	  }
	  return dataList.toArray(new Object[0][]);
  }
  
  public void  login() {
	  System.out.println("Login Success");
  }
  
  public void close() {
	  System.out.println("Close Success");
  }
  @Test(dataProvider = "dp")
  public void f(String id, String name,String exe) throws InterruptedException {
	  if(exe.equalsIgnoreCase("Y")) {
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("alert('UserModule:'+arguments[0]);",name);
		  Thread.sleep(1000);
		  Alert Alt=driver.switchTo().alert();
		  Alt.accept();
		  int noofrowsTest=sheetTest.getPhysicalNumberOfRows();
		  Object[][] value=Testdatas(noofrowsTest);
		  for(int i=0;i<value[0].length;i++) {
			 System.out.println(value[0][i]);
		  }
		  int noofrowsstep=sheetTeststep.getPhysicalNumberOfRows(); 
		  Object[][] result=TestStep(noofrowsstep,value);
		  
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
     ArrayList<Object[]> dataList=new ArrayList();
     for(int i=1;i<noofrows;i++) {
    	 String id=sheet.getRow(i).getCell(0).getStringCellValue();
    	 String name=sheet.getRow(i).getCell(1).getStringCellValue();
    	 String exe=sheet.getRow(i).getCell(2).getStringCellValue();
    	 dataList.add(new Object[] {id,name,exe});
    };
    return dataList.toArray(new Object[0][]);
  }
  @BeforeClass
  public void beforeClass() throws IOException {
	  InputStream input=new FileInputStream("C:\\Users\\ashwin.murugan\\eclipse-workspace\\sample\\organizer.xlsx");
	  workbook=new XSSFWorkbook(input);
	  sheet=workbook.getSheet("Module");
	  sheetTest=workbook.getSheet("Testcase");
	  sheetTeststep=workbook.getSheet("Teststep");
	  noofrows=sheet.getPhysicalNumberOfRows();
	  System.out.println("rows:"+noofrows);
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://demo.opencart.com/en-gb?route=account/login");
  }

  @AfterClass
  public void afterClass() {
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
