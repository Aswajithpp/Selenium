package testNGpkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Assertions {
	
	WebDriver driver;
	  @BeforeTest
	     
	     public void browsersetput() {
	    	 driver = new ChromeDriver();
	    	 
	     }
	  @BeforeMethod
	  public void urlSetup() {
		  driver.get("https://keralaproperty.in");
		  driver.manage().window().maximize();
	  }
	  @Test
	  public void softAssertion() {
		  //titileverification
		  
		  String expectedresult = "kerala property";
		  String actualresult = driver.getTitle();
		 
	        System.out.println("actualtitle"+actualresult);

	        if(expectedresult.equals(actualresult)) {
	            System.out.println("pass");
	        }
	        else {
	            System.out.println("fail");
	        }

	}
	   
	  @Test
	  public void hardAssertion() {
		  String expectedresult = "kerala property";
		  String actualresult = driver.getTitle();
		 
	        System.out.println("actualtitle"+actualresult);
	        Assert.assertEquals(expectedresult, actualresult);
	  }
	  
}
