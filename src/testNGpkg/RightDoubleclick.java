package testNGpkg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightDoubleclick {
	
	WebDriver driver;
	String url = "https://demo.guru99.com/test/simple_context_menu.html";
	
	@BeforeMethod
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}
	
	
	
	@Test
    public void rightClickHandle() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
    	Actions act=new Actions(driver);
    	Thread.sleep(3000);
    	WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
    	act.contextClick(rightclick).perform();
    	
    	driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']")).click();
    	Alert alertedit = driver.switchTo().alert();
    	
    	String expected="clicked: edit";
    	String edittxt =alertedit.getText();
    	Assert.assertEquals(edittxt, expected);
    	alertedit.accept();
    	
    	
	    //doubleclick
		
    	
    	WebElement doubleclick=driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
    	act.doubleClick(doubleclick).perform();
    	
    	Alert alert =driver.switchTo().alert();
    	Thread.sleep(3000);
    	
    	
    	String exp="You double clicked me.. Thank You..";
    	String actual=alert.getText();
    	System.out.println(actual);
    	Assert.assertEquals(actual, exp);
    	alert.accept();
    	
 	
    }
  @AfterMethod
  public void tabclose() {
	  driver.close();
  }
		
		
	}
	

