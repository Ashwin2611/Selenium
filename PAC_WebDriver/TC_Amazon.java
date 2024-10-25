package PAC_WebDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC_Amazon {
  WebDriver driver;
  TC_Amazon_POM Amaz;
  @Test(dataProvider = "dp")
  public void f(String username, String password,String Monitor,String Mobile) throws InterruptedException {
	  
	  	Amaz.ClickMethod("nav-link-accountList", "id");
	  	Amaz.SendKeysMethod("ap_email","id",username);
	  	Amaz.ClickMethod("continue", "id");
	  	Amaz.SendKeysMethod("ap_password", "id", password);
	  	Amaz.ClickMethod("signInSubmit", "id");
		
		//Search
	  	WebElement Search=Amaz.DriverMethod("twotabsearchtextbox","id");
		Search.sendKeys(Monitor);
		Search.submit();
		
		//Dropdown
		Amaz.ClickMethod("//*[@id=\"a-autoid-0-announce\"]", "xpath");
		Amaz.ClickMethod("s-result-sort-select_1", "id");
		
		//Scroll
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300);");
		
		Thread.sleep(8000);
		
		//AddToCart
		WebElement item=Amaz.DriverMethod("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a", "xpath");
//		WebElement item=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a"));
		item.click();
		
		String itemName=item.getText();
		
		ArrayList<String> list=new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(list.get(1));
		
		Amaz.ClickMethod("add-to-cart-button", "id");
//		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.navigate().back();
		
		Amaz.ClickMethod("add-to-wishlist-button-submit", "id");
//		driver.findElement(By.id("add-to-wishlist-button-submit")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement monitor=Amaz.DriverMethod("//a[@id='huc-item-link']/span", "xpath");
//		WebElement monitor=driver.findElement(By.xpath("//a[@id='huc-item-link']/span"));
		
		System.out.println(monitor.getText());
		System.out.println(itemName);
		
		//Product Wishlist verification
		if(monitor.getText().equals(itemName)) {
			System.out.println("Success You have added "+itemName);
			js.executeScript("alert('Success You have added '+ arguments[0])",itemName);
		}
		
		Thread.sleep(2000);
		Alert Alt=driver.switchTo().alert();
		Alt.accept();
		
		//close Wishlist
		Amaz.ClickMethod("/html/body/div[8]/div/div/header/button", "xpath");
//		driver.findElement(By.xpath("/html/body/div[8]/div/div/header/button")).click();
		//*[@id="a-popover-2"]/div/header/button
		
		//Search Mobile in SearchBox
		WebElement SearchMobile=Amaz.DriverMethod("twotabsearchtextbox", "id");
//		WebElement SearchMobile=driver.findElement(By.id("twotabsearchtextbox"));
		SearchMobile.clear();
//		SearchMobile.sendKeys("");
		SearchMobile.sendKeys(Mobile);
		SearchMobile.submit();
		
		//checkBox
		WebElement Apple=Amaz.DriverMethod("//*[@id=\"p_123/110955\"]/span/a", "xpath");
//		WebElement Apple=driver.findElement(By.xpath("//*[@id=\"p_123/110955\"]/span/a"));
		Apple.click();
	
		Amaz.ClickMethod("nav-cart", "id");
//		driver.findElement(By.id("nav-cart")).click();
		
		List<WebElement> CartItem=Amaz.DriversMethod("//div[@name='sc-quantity']/div/span[2]", "xpath");
//		List<WebElement> CartItem=driver.findElements(By.xpath("//div[@name='sc-quantity']/div/span[2]"));
		System.out.print(CartItem);
		
		for(WebElement val:CartItem) {
			System.out.println(val.getText());
			if(Integer.parseInt(val.getText())>=1) {
				System.out.println("Value More thst 1: "+val.getText());
				WebElement decrement=Amaz.DriverMethod("//button[@data-a-selector='decrement']", "xpath");
//				WebElement decrement=driver.findElement(By.xpath("//button[@data-a-selector='decrement']"));
				Thread.sleep(1000);
				decrement.click();
				js.executeScript("alert('CartItem is Empty')");
				Thread.sleep(2000);
				Alert Alts=driver.switchTo().alert();
				Alts.accept();
			}
		}
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  Amaz=new TC_Amazon_POM(driver);
	  driver.get("https://www.amazon.in/");
  }

  @AfterMethod
  public void afterMethod() {
	  WebElement signout=Amaz.DriverMethod("nav-link-accountList", "id");
//	  WebElement signout=driver.findElement(By.id("nav-link-accountList"));
		
	  Actions act=new Actions(driver);
		
	  act.moveToElement(signout).perform();
		
	  Amaz.ClickMethod("nav-item-signout", "id");
//	  driver.findElement(By.id("nav-item-signout")).click();
	  
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "ashwinmurugan1@gmail.com", "Ashwin@2611","Monitors","Mobile" },
      new Object[] { "ashwin@gmail.com", "12345","Phone","Laptop" },
    };
  }
  @BeforeClass
  public void beforeClass() {
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
