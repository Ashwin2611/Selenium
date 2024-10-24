package PAC_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class TC_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Ashwin");
		driver.findElement(By.name("proceed")).click();
		Alert Popup=driver.switchTo().alert();
		System.out.println(Popup.getText());
		Popup.accept();
		driver.navigate().to("https://letcode.in/alert");
		
		List<WebElement> value=driver.findElements(By.xpath("//div[@class='control']/button"));
		
		for(WebElement element : value) {
			Alert Ele;
//			System.out.println(element.getText());
			if(element.getText().equals("Modern Alert")) {
				element.click();
				driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button")).click();
				break;
			}
			if(element.getText().equals("Prompt Alert")) {
				element.click();
				Ele=driver.switchTo().alert();
				Ele.sendKeys("Ashwin");
			}else {
				element.click();
				Ele=driver.switchTo().alert();
				System.out.print(Ele.getText());
			}
			Ele.accept();	
			
		}
		

	}

}
