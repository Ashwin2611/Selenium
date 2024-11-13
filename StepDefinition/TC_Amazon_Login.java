package StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PAC_WebDriver.TC_Amazon_POM;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Amazon_Login {
	  WebDriver driver;
	  TC_Amazon_POM Amaz;
	  Properties prob;
	  XSSFSheet sheet;
	  ExtentReports extent;
	  ExtentTest test;
	  int noofrows;
	  static int item=0;
	  ArrayList<Object[]> dataList=new ArrayList();
	  
	  
	public void loginCredentials() throws IOException {
		extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("AmazonReport.html");
		extent.attachReporter(spark);
		test=extent.createTest("Login Verification");
		InputStream input=new FileInputStream("C:\\Users\\ashwin.murugan\\eclipse-workspace\\sample\\Amazon_testSheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		noofrows=sheet.getPhysicalNumberOfRows();
		String pass=null;
		for(int i=0;i<noofrows;i++) {
			String uname=sheet.getRow(i).getCell(0).getStringCellValue();
			if(sheet.getRow(i).getCell(1).getCellType()==CellType.STRING) {
				 pass=sheet.getRow(i).getCell(1).getStringCellValue();
			}else {
				int p=(int)sheet.getRow(i).getCell(1).getNumericCellValue();
				pass=Integer.toString(p);
			}
			dataList.add(new Object[]{uname,pass});
		}
		dataList.toArray(new Object[0][]);
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
	
	@Before
	public void setUp() throws IOException {
		loginCredentials();
	}
	
	@Given("Login in the Browser and Go to login Page")
	public void login_in_the_browser_and_go_to_login_page() throws IOException {
		Amaz=new TC_Amazon_POM(driver);
		driver.get("https://www.amazon.in/");
	  	Amaz.ClickMethod("nav-link-accountList", "id");
//	    throw new io.cucumber.java.PendingException();
	}

	@Given("Give User Credentials and login {string} {string}")
	public void give_user_credentials_and_login_username_password(String username, String password) {
	    System.out.println("Logging in with username: " + username + " and password: " + password);
	    // Implement actual login actions here using Selenium
	    // Example: driver.findElement(By.id("username")).sendKeys(username);
	}

//	@When("Give User Credentials and login")
//	public void give_user_credentials_and_login() {
//	    System.out.println("Logging in without direct parameterized input.");
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("Search Monitor in search box")
	public void search_monitor_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Choose your Item")
	public void choose_your_item() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Add the Item to the cart")
	public void add_the_item_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Add the Same Item in WishList")
	public void add_the_same_item_in_wish_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("close WishList and Search Mobile in Search box")
	public void close_wish_list_and_search_mobile_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Choose Samsng in the Filter Option")
	public void choose_samsng_in_the_filter_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Go to Cart and reduce Item Quantity")
	public void go_to_cart_and_reduce_item_quantity() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click your profile and logout")
	public void click_your_profile_and_logout() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify Login")
	public void verify_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
