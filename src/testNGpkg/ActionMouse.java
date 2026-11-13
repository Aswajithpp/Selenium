package testNGpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionMouse {
	WebDriver driver;
	String url = "https://www.ebay.com/";
	
	@BeforeMethod
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void mouseAction() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(3000);
		WebElement electronic = driver.findElement(By.xpath("//*[@id='vl-flyout-nav']/ul/li[4]/a"));
	    electronic.click();
	    
		Actions act =  new Actions(driver);
		act.moveToElement(electronic).perform();
		
		Thread.sleep(3000);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vl-flyout-nav']/ul/li[4]/div/[1]/nav/[1]/ul/li/[1]"))).click();
		
//		act.keyDown(Keys.CONTROL).click().perform();
	    
		
	}
}

