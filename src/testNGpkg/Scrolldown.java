package testNGpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown {
	//scroll down using javascriptexecuter by defining the pixel
   
	WebDriver driver;
		@BeforeTest
	public void browserSetup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlSetup() {
		//driver.get(url);
		//page load
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	@Test
	public void definePixel() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)", "");
		Thread.sleep(3000);
	}

	@Test
	public void elementVisible() {
	   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
       WebElement ele = driver.findElement(By.id("Register"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("argument[0], scrollintoview()",ele);
	}
	
	@Test
	public void bottomPage() throws InterruptedException {
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}
}



