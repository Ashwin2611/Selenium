package PAC_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TC_MutltiSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		List<WebElement> elements=driver.findElements(By.xpath("//input[@class='form-control']"));
	    driver.findElement(By.id("input-firstname")).sendKeys("Ashwin");
	    driver.findElement(By.id("input-lastname")).sendKeys("M");
	    driver.findElement(By.id("input-email")).sendKeys("Ashwin@gamil.com");
	    driver.findElement(By.id("input-password")).sendKeys("12345");
		System.out.println(elements);
		for(WebElement element:elements) {
			System.out.println("Element: "+element.getAttribute("value"));
		}
	}

}
