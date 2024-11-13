package StepDefinition;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CucuLogin {
	WebDriver driver;
	@Given("Launch the Browser")
	public void launch_the_browser() {
	    WebDriverManager.edgedriver().setup();
	    driver=new EdgeDriver();
	}

	@Given("Navigate to the URL")
	public void navigate_to_the_url() {
	    driver.get("https://demo.opencart.com/en-gb?route=account/login");
	}

	@When("Enter the valid username and password")
	public void enter_the_valid_username_and_password() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		Properties prob=new Properties();
		InputStream input=new FileInputStream("C:\\Users\\ashwin.murugan\\eclipse-workspace\\sample\\src\\test\\java\\com\\opencart\\testdata\\login.properties");
	    prob.load(input);
	    String uname=prob.getProperty("username");
	    String pass=prob.getProperty("password");
	    driver.findElement(By.id("input-email")).sendKeys(uname);
	    driver.findElement(By.id("input-password")).sendKeys(pass);
	}

	@When("Click on login button")
	public void click_on_login_button() throws InterruptedException {
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,300);");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Verify the login")
	public void login_should_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			if(driver.findElement(By.linkText("Logout")).isDisplayed()) {
				System.out.println("Login Successful");
			}else {
				System.out.println("Login Unsuccessful");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
//	    throw new io.cucumber.java.PendingException();
	}
	
	@And("Close Browser")
	public void Close_Browser() {
		driver.close();
	}

}
