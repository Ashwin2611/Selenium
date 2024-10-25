package PAC_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title of the Page:"+driver.getTitle());
		WebElement val=driver.findElement(By.id("APjFqb"));
		val.sendKeys("Testing");
		String value=val.getAttribute("value"); //to get the value 
		System.out.print("Given Value:"+value);
		val.submit();
//		System.out.println("");
		driver.navigate().to("https://leetcode.com/");
		System.out.println(driver.getTitle()+"1");
		driver.navigate().back();
		System.out.println(driver.getTitle()+"2");
		driver.navigate().forward();
		System.out.println(driver.getTitle()+"3");
		driver.navigate().refresh();
		System.out.println(driver.getTitle()+"4");
		System.out.println("Current URL: "+driver.getCurrentUrl());
//		System.out.println("Source contains:"+driver.getPageSource().contains("Premium"));
//		System.out.println("Source: "+driver.getPageSource());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Ashwin')");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert Alt=driver.switchTo().alert();
		Alt.accept();
		
//		driver.close();
		

	}

}
