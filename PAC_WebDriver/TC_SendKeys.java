package PAC_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class TC_SendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Ashwin");
		driver.findElement(By.id("input-firstname")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("input-firstname")).sendKeys(Keys.NUMPAD7);
		
	}

}
