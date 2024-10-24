package PAC_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Lab1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		if(driver.getTitle().equals("Register Account")) {
			System.out.print("Accept");
		}else {
			System.out.println("Reject");
		}
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(320,document.body.scrollHeight);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Warning:"+driver.findElement(By.id("alert")).isDisplayed());
		Thread.sleep(1500);
		System.out.print(driver.findElement(By.xpath("//div[@id='alert']/dirv")).getText());
		
	}

}
