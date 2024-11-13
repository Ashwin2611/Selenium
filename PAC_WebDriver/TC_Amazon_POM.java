package PAC_WebDriver;

import java.util.List;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_Amazon_POM {

	WebDriver driver;
	By clickval;

	public TC_Amazon_POM(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ClickMethod(String val,String locator) {
		if(locator.equalsIgnoreCase("xpath")) {
			clickval=By.xpath(val);
		}else if(locator.equalsIgnoreCase("id")) {
			clickval=By.id(val);
		}
		driver.findElement(clickval).click();
	}
	
	public void SendKeysMethod(String val,String locator,String sendkeyval) {
		if(locator.equalsIgnoreCase("id")) {
			clickval=By.id(val);
		}else if(locator.equalsIgnoreCase("xpath")) {
			clickval=By.xpath(val);
		}
		driver.findElement(clickval).sendKeys(sendkeyval);
	}
	
	public WebElement DriverMethod(String val,String locator) {
		if(locator.equalsIgnoreCase("id")) {
			return driver.findElement(By.id(val));
		}
		else if(locator.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(val));
		}
		return null;
	}
	
	public List<WebElement> DriversMethod(String val,String locator) {
		if(locator.equalsIgnoreCase("xpath")) {
			return driver.findElements(By.xpath(val));
		}
		return null;
	}
}
