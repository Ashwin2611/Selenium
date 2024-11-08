package Odyssey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Odyssey_POM {
	
	WebDriver driver;
	By act;
	
	public Odyssey_POM(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ClickMethod(String val,String locator) {
		if(locator.equalsIgnoreCase("class")) {
			act=By.className(val);
		}else if(locator.equalsIgnoreCase("xpath")) {
			act=By.xpath(val);
		}else if(locator.equalsIgnoreCase("id")) {
			act=By.id(val);
		}
		driver.findElement(act).click();
	}
	
	public void SendKeyMethod(String val,String locator,String input) {
		if(locator.equalsIgnoreCase("class")) {
			act=By.className(val);
		}else if(locator.equalsIgnoreCase("xpath")) {
			act=By.xpath(val);
		}else if(locator.equalsIgnoreCase("id")) {
			act=By.id(val);
		}
		driver.findElement(act).sendKeys(input);
	}
}
