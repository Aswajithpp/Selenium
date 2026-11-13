package testNGpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2window {
	WebDriver driver;
	String url = "https://demo.guru99.com/popup.php";
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
	  public void windowHandler() {
		   
		  String parentwindow = driver.getWindowHandle();
		  System.out.println("Title of page"+driver.getTitle());
		  driver.findElement(By.xpath("/html[1]/body[1]/p[1]/a[1]")).click();
		  
		  Set<String> allwindowhandles = driver.getWindowHandles();
		  for(String handle : allwindowhandles) {
			  driver.switchTo().window(handle);
			  
			  driver.findElement(By.name("emailid")).sendKeys("aswajith@123");
			  driver.findElement(By.name("btnLogin")).click();
			  
			  driver.close();
			  driver.switchTo().window(parentwindow);

		  }

	  }
}
