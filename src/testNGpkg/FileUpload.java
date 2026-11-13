package testNGpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver driver;
	String url = "https://www.demo.guru99.com/test/upload/";
	 @BeforeTest
	    public void browserSetUp() {
	        driver = new ChromeDriver();
	        
	    }
	        @BeforeMethod
	        public void urlSetUp() {
	        	driver.get(url);
	            driver.manage().window().maximize();
	        }
	        @Test
	        public void fileChoosing() throws InterruptedException {
	        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        Actions act = new Actions(driver);
	        
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id='uploadfile_0']")).sendKeys("C:\\Users\\aswaj\\OneDrive\\Documents\\Doc2.pdf"); 
	    	
	    	driver.findElement(By.xpath("//*[@id='terms']")).click();
	    	driver.findElement(By.id("submitbutton")).click();
	    	Thread.sleep(3000);
	        }
	        
	        @AfterMethod
	        public void tabclose() {
	        	driver.close();
	        }
}	        
	        
	        