package PAC_WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
        try {
            driver.get("https://demo.opencart.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            // Wait until the "My Account" element is clickable
            WebElement myAccountLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#top > div > div.nav.float-end > ul > li:nth-child(2) > div")));
            
            // Click the "My Account" link
            String value=myAccountLink.getAttribute("class");
            System.out.println("Value"+value);
            myAccountLink.click();
//            Thread.sleep(2000);
            System.out.println("My Account Link Class: " + myAccountLink.getAttribute("class"));
            
            // Wait for the login link to be visible (or whichever element you expect next)
//            WebElement loginLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
            
            // Print the class attribute of the "My Account" link after clicking
//            System.out.println("Login Link Found: " + loginLink.getText());
        } finally {
            // Close the driver
//            driver.quit();
        }
//		System.out.println(val.getAttribute("class"));
//		String value=val.getText();
//		System.out.println("Value:"+value);
//		System.out.println(driver.findElement(By.cssSelector("#top > div > div.nav.float-end > ul > li:nth-child(2) > div > a > span")));
//		WebElement val=driver.findElement(By.cssSelector("#top > div > div.nav.float-end > ul > li:nth-child(2) > div > a > span"));
//		System.out.println("Value:"+);
//		try {
//		    Thread.sleep(1000); // Sleep for 1 second (not ideal but can be used for debugging)
//		} catch (InterruptedException e) {
//		    e.printStackTrace();
//		}
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Login")));
//		wait.until(ExpectedConditions.elementToBeClickable(By.name("Login"))).click();
//		driver.findElement(By.linkText("Login")).click();
		
//		driver.findElement(By.);
		
		
	}

}
