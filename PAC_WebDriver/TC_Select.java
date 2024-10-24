package PAC_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class TC_Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[2]/a")).click();
		Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div")));
		sel.selectByVisibleText("Login");
		

	}

}
