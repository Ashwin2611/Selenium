package PAC_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(320,document.body.scrollHeight);");
		Thread.sleep(2000);
//		System.out.println("Warning:"+driver.findElement(By.id("alert")).isDisplayed());
		Thread.sleep(7500);
//		System.out.print(driver.findElement(By.xpath("//div[@id='alert']/dirv")).getText());
		WebElement firstName=driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("HelloIAMashwin,santhosh,Harrish,pratham,syedufouhdsfohsdofhosidhosd");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		Boolean FirstNameerr=driver.findElement(By.id("error-firstname")).isDisplayed();
		if(FirstNameerr==true) {
			System.out.println("FirstName Error:"+driver.findElement(By.id("error-firstname")).getText());
		}else {
			System.out.println("Not Error");
		}
		Boolean lastNameerr=driver.findElement(By.id("error-lastname")).isDisplayed();
		if(lastNameerr==true) {
			System.out.println("LastName Error:"+driver.findElement(By.id("error-lastname")).getText());
		}else {
			System.out.println("Not Error");
		}
		Boolean Emailerr=driver.findElement(By.id("error-email")).isDisplayed();
		if(Emailerr==true) {
			System.out.println("Email Error:"+driver.findElement(By.id("error-email")).getText());
		}else {
			System.out.println("Not Error");
		}
		
		
		
//		WebElement email=driver.findElement(By.id("input-email"));
//		System.out.print(email.getText());
		
		
	}

}
