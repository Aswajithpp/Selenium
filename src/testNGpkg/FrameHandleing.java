package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameHandleing {
	WebDriver driver;
	String url = "https://leafground.com/frame.xhtml";
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
	  public void frameHandle() {
		  driver.switchTo().frame(0);
		WebElement clicked =  driver.findElement(By.id("Click"));
		clicked.click();
		String actualResult = clicked.getText();

        String expectedResult = "Hurray! You Clicked Me.";

        System.out.println("Actual Result : " + actualResult);
        System.out.println("Expected Result : " + expectedResult);

        
        Assert.assertEquals(actualResult, expectedResult);

        driver.switchTo().defaultContent();
	  }
	  
	  @AfterTest
	  public void tabClose() {
		  driver.close();
	  }
}

