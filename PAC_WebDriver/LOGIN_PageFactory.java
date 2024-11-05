package PAC_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LOGIN_PageFactory {

	WebDriver driver;
//	By username=By.id("input-email");
	@FindBy(id="input-email")
	WebElement username;
//	By password=By.id("input-password");
	@FindBy(id="input-password")
	WebElement password;
//	By loginbutton=By.xpath("//button[@type='submit']");
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	
//	public LOGIN_PageFactory(WebDriver driver) {
//		this.driver=driver;
//	}


	void enterusername(String name) {
		driver.findElement((By) username).sendKeys(name);
	}
	
	void enterpassword(String pass) {
		driver.findElement((By) password).sendKeys(pass);
	}
	
	void Loginbtn() {
		driver.findElement((By) loginbutton).click();
		System.out.println("Clicked");
	}
}
