package testNGpkg;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	String url = "https://www.google.com";

	@Parameters("browser")
	@BeforeTest
	public void browsersetup(String browser) {
		if(browser.equals("FireFoxDriver")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("ChromeDriver")) {
			driver = new ChromeDriver();
		}
		
		else {
			driver = new EdgeDriver();
			
		}
		
		
	}
	
	@BeforeMethod
	public void urlsetup() {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test
	public void googlesearch() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Books" ,Keys.ENTER);
		Thread.sleep(3000);
	
	}
	
	@AfterMethod
	
	public void tabclosing() {
		driver.close();
	}
	
	@AfterTest
	public void browserclosing() {
    driver.close();		
	}

}
