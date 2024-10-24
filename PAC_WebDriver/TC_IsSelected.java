package PAC_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class TC_IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		Thread.sleep(3000);
		WebElement firstName=driver.findElement(By.id("input-newsletter"));
		firstName.click();
		if(firstName.isSelected()) {
			System.out.println("Selected");
		}else {
			System.out.println("Not Selected");
		}
		

	}

}
