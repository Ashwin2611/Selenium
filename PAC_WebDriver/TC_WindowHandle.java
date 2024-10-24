package PAC_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.sun.tools.javac.util.List;

public class TC_WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://letcode.in/windows");
		
		System.out.println("Window Handle: "+driver.getWindowHandle());
		
		driver.findElement(By.id("multi")).click();
		
		ArrayList<String> list=new ArrayList(driver.getWindowHandles());
		
		for(String i:list) {
			System.out.println(i);
		}
//		
		driver.switchTo().window(list.get(2));
		System.out.println(driver.getCurrentUrl());
		
		
		

	}

}
