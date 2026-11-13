package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandle {
	
	WebDriver driver;
	String url = "http://www.google.com";
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
	  public void windowHandler() throws InterruptedException {
		  String parentwindow = driver.getWindowHandle();
		  System.out.println("Title of page"+driver.getTitle());
		  
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.name("email")).sendKeys("aswajith@gmail.com");
		  driver.findElement(By.name("pass")).sendKeys("Aswajith@123");
//		  driver.findElement(By.name("")).click();
		  Thread.sleep(3000);
		  
		  driver.close();
		  driver.switchTo().window(parentwindow);
		  System.out.println(driver.getTitle());
		  
		  
	  }
}

