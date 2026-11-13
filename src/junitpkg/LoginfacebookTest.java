package junitpkg;
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
public class LoginfacebookTest {
  private WebDriver driver;
 
  @Before
  public void setUp() {
    driver = new ChromeDriver();
   
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginfacebook() {
    driver.findElement(By.xpath("//form[@id=\'login_form\']/div/div/div/div[5]/div/a/div/div")).click();
    driver.findElement(By.cssSelector("#\\_r_3_ .x6s0dn4 > .x1lliihq")).click();
    driver.findElement(By.cssSelector("#\\_r_1___4 > .html-div")).click();
    driver.findElement(By.cssSelector("#\\_r_9_ .x6s0dn4 > .x1lliihq")).click();
    driver.findElement(By.cssSelector("#\\_r_7___2 .x1lliihq")).click();
    driver.findElement(By.cssSelector("#\\_r_f_ .x6s0dn4 > .x1lliihq")).click();
    driver.findElement(By.cssSelector("#\\_r_d___22 .x1lliihq")).click();
    driver.close();
    driver.get("https://www.facebook.com//");
  }
}

