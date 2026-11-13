package testNGpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Waits {
     WebDriver driver;
     String url ="https://www.amazon.in/";
     @BeforeTest
     
     public void browsersetput() {
    	 driver = new ChromeDriver();
    	 
     }
    @BeforeMethod
    public void urlSetup() {
    	driver.get(url);
    	//pageload
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    	driver.manage().window().maximize();
    }
    
    @Test
    public void amozonWork() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
    	
    }
    
    @Test
    public void amozonlinkClick() {
    WebDriverWait wait = new WebDriverWait(driver,(Duration.ofSeconds(20)));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-xshop']/ul/li[5]/div/a"))).click();
    
        }
    
}



