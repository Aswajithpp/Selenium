package testNGpkg;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task {
	
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
   public void switchWindow() {
	   driver.findElement(By.xpath("/html[1]/body[1]/p[1]/a[1]")).click();
	   
	  String parentwindow = driver.getWindowHandle();
	  System.out.println("Title of page"+driver.getTitle());
	  
	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.get("https://demo.guru99.com/articles_popup.php");
	  
	  driver.findElement(By.name("emailid")).sendKeys("aswajith@123");
	  driver.findElement(By.name("btnLogin")).click();
	  
	 
	  ArrayList<String> allwindows = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(allwindows.get(0));
	  System.out.println(": " + driver.getTitle());
	  
}
}

