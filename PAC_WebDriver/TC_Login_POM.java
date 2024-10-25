package PAC_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_Login_POM {

	WebDriver driver;
	By username=By.id("input-email");
	By password=By.id("input-password");
	By loginbutton=By.xpath("//button[@type='submit']");
	
	public TC_Login_POM(WebDriver driver) {
		this.driver=driver;
	}


	void enterusername(String name) {
		driver.findElement(username).sendKeys(name);
	}
	
	void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	void Loginbtn() {
		driver.findElement(loginbutton).click();
		System.out.println("Clicked");
	}

}
