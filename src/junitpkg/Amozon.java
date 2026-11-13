package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amozon {

	WebDriver driver;
	
	String url = "https://www.amozon.com";
	
	  @Before
	    public void envsetup() {
	    	driver = new ChromeDriver();
	    	driver.get(url);
	    	driver.manage().window().maximize();
	    }
	    
	  
	  
    @Test
    public void googlesearch() throws InterruptedException {
   	driver.findElement(By.name("field-keywords")).sendKeys("mobiles");   	
   	Thread.sleep(2000);
   	WebElement search = driver.findElement(By.name("nav-search-submit-button"));
   	Thread.sleep(2000);
   	search.click();
  	Thread.sleep(5000);

  	search.submit();

   }
    
	  @After
	  public void close() {
		  driver.close();
	  }
	  
	
}


