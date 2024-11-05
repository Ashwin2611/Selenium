package PAC_WebDriver;

import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login_Excel {
    @Test
	void login() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
//    	String Projectpath=System.getProperty("user.dir");
//    	Properties prob=new Properties();
//    	InputStream input=new FileInputStream(Projectpath+"\\login.properties");
//    	prob.load(input);
//    	String OpenUrl=prob.getProperty("url");
//    	String uname=prob.getProperty("username");
//    	String pass=prob.getProperty("password");
    	
    	InputStream input =new FileInputStream("C:\\Users\\ashwin.murugan\\eclipse-workspace\\sample\\opencart_testsheet.xlsx");
    	XSSFWorkbook workbook=new XSSFWorkbook(input);
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            System.out.println("Sheet name: " + workbook.getSheetName(i));
        }
    	XSSFSheet sheet=workbook.getSheet("Sheet1");
    	System.out.println(sheet);
    	
    	int noofrows=sheet.getPhysicalNumberOfRows();
//    	int noofcol=sheet.
    	System.out.println("rows:"+sheet.getRow(1).getCell(0).getCellType());
//    	if(sheet.getRow(1).getCell(0).getCellType().equals("STRING")) {
//    		System.out.print("hii");
//    	}
    	
    	for(int i=0;i<noofrows;i++) {
    		String OpenUrl=sheet.getRow(i).getCell(0).getStringCellValue();
    		String uname=sheet.getRow(i).getCell(1).getStringCellValue();
    		int num=(int) sheet.getRow(i).getCell(2).getNumericCellValue();
    		String pass=Integer.toString(num);
    	
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(OpenUrl);
		
		TC_Login_POM LP=new TC_Login_POM(driver);
		LOGIN_PageFactory obj=PageFactory.initElements(driver, LOGIN_PageFactory.class);
		
		LP.enterusername(uname);
		
		LP.enterpassword(pass);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		LP.Loginbtn();
		
        try {
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

}
