package PAC_WebDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC_TestNg {
  WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) {
	  System.out.println("This is the test");
	  driver.findElement(By.id("input-email")).sendKeys(username);
	  driver.findElement(By.id("input-password")).sendKeys(password);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,300);");
	  driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
  }
  
  @Test(dataProvider="search")
  public void r(String SearchItem) {
	  System.out.print(SearchItem);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://demo.opencart.com/en-gb?route=account/login");
	  System.out.println("This is @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]")).click();
	  driver.quit();
	  System.out.println("This is @AfterMethod");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "ashwin@gmail.com", "12345" },
      new Object[] { "ashwinmurugan1@gmail.com", "12345" },
    };
  }
  @DataProvider
  public Object[][] search(){
	  return new Object[][] {
		  new Object[] {"Monitor"},
		  new Object[] {"Mobile"}
	  }
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is the @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is the @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is the @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is the @AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is the @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is the @AfterSuite");
  }

}
