package PAC_WebDriver;

import java.time.Duration;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.opencart.pageobjects.TC_Login_POM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login_XML {
    @Test
	void login() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
		// TODO Auto-generated method stub
		
//    	String Projectpath=System.getProperty("user.dir");
//    	Properties prob=new Properties();
//    	InputStream input=new FileInputStream(Projectpath+"\\login.properties");
//    	prob.load(input);
//    	String OpenUrl=prob.getProperty("url");
//    	String uname=prob.getProperty("username");
//    	String pass=prob.getProperty("password");
    	
    	File xmlfile=new File("C:\\Users\\ashwin.murugan\\eclipse-workspace\\sample\\login.xml");
    	DocumentBuilderFactory DBFactory=DocumentBuilderFactory.newInstance();
    	DocumentBuilder DBBuilder=DBFactory.newDocumentBuilder();
    	Document DBDoc=(Document) DBBuilder.parse(xmlfile);
    	System.out.println("Document:"+DBDoc);
    	NodeList LoginDetails=DBDoc.getElementsByTagName("LoginDetails");
    	for(int i=0;i<LoginDetails.getLength();i++) {
    		Node LoginDetailsNode=LoginDetails.item(i);
    		System.out.println("LoginDetails:"+LoginDetailsNode.getNodeType());
    		
    		if(LoginDetailsNode.getNodeType()==Node.ELEMENT_NODE) {
//    			NodeList urlList=LoginDetailsNode.
    		}
    		
    	}
    	NodeList NL=((Node) DBDoc).getChildNodes();
    	Node n=NL.item(0);
    	Element ele=(Element)n;
    	String opencart_url=ele.getElementsByTagName("url").item(0).getTextContent();
    	String uname=ele.getElementsByTagName("username").item(0).getTextContent();
    	String pass=ele.getElementsByTagName("password").item(0).getTextContent();
    	int k=0;
    	System.out.println("NodeList:"+NL.getLength());
    	System.out.println("Node:"+NL.item(0));
    	int i=0;
    	while(ele.getElementsByTagName("url").item(i).getTextContent()!=null) {
    		System.out.println(ele.getElementsByTagName("url").item(i).getTextContent()+'\n'+ele.getElementsByTagName("username").item(i).getTextContent()+'\n'+ele.getElementsByTagName("password").item(i).getTextContent());
    		++i;
//    		System.out.print();
    	}
    	
    	
    	
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(opencart_url);
		
		TC_Login_POM LP=new TC_Login_POM(driver);
		LOGIN_PageFactory obj=PageFactory.initElements(driver, LOGIN_PageFactory.class);
		
		LP.enterusername(uname);
		
		LP.enterpassword(pass);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300);");
		
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
