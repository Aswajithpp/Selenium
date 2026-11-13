package testNGpkg;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultiWindowhandler {
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
		  
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://www.ebay.com/");
		  System.out.println("title of page"+driver.getTitle());
		  
		  ArrayList<String> allwindows = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(allwindows.get(1));
//		  System.out.println("Ebay title: " + driver.getTitle());
		  System.out.println("Ebay title :  "+driver.getTitle());
		  
	  }
}
		    
		  
		 



