package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	WebDriver driver;
	
    String url = "https://www.google.com";
    
    @Before
    public void envsetup() {
    	driver = new ChromeDriver();
    	driver.get(url);
    	driver.manage().window().maximize();
    }
    
    
    @Test
   public void search() throws InterruptedException {
    	driver.findElement(By.name("q")).sendKeys("Books");
    	Thread.sleep(2000);
  	driver.findElement(By.name("btnK")).click();
   	Thread.sleep(2000);
 
    }

    
    
    
//  
    @Test
    public void googlesearch() throws InterruptedException {
   	driver.findElement(By.name("q")).sendKeys("Books");
   	Thread.sleep(2000);
    	WebElement search = driver.findElement(By.name("btnK"));
    	Thread.sleep(2000);

    	search.click();
   	Thread.sleep(5000);

   	search.submit();

   }
    
    
    
//    @Test public void searchenter() {
//    	WebElement search = driver.findElement(By.name("q"));
//    	search.sendKeys("books",Keys.ENTER);
//    }
    
    
//        @Test
//   public void search() {
//   	driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
//   }
//   
    
    
    @After
    public void close() {
//    	driver.close();
    }
	 

}


