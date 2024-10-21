// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TCQ1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tCQ1() {
    driver.get("https://www.google.co.in/");
    driver.manage().window().setSize(new Dimension(1280, 672));
    {
      WebElement element = driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("APjFqb")).sendKeys("testing methods");
    driver.findElement(By.name("btnK")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".sinMW:nth-child(1) .FZPZX"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector("div:nth-child(3) > .LatpMc > .YmvwI")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/span/a/div/div/cite"));
      assert(elements.size() > 0);
    }
  }
}
