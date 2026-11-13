package testNGpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragANDDrop {
	
	WebDriver driver;
	String url ="https://demoqa.com/droppable";
	@BeforeMethod
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void dragAnddrop() throws InterruptedException {
		WebElement dragme = driver.findElement(By.id("draggable"));
	    WebElement Drophere = driver.findElement(By.id("droppable"));
//		WebElement dragme = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
//    	WebElement Drophere = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
	    
	Thread.sleep(3000);
	    
	Actions act =  new Actions(driver);
	act.dragAndDrop(dragme, Drophere).perform();
	
	 String expectedResult = "Dropped!";

	 String actualResult = Drophere.getText();
//	 String actualResult = driver.getTitle();

	 System.out.println("Actual Result: " + actualResult);

	 Assert.assertEquals(actualResult, expectedResult);

	}

	@AfterMethod
	public void tabclose() {
		driver.close();
	}
}

