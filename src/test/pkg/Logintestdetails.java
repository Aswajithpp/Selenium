package test.pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.pkg.Loginpagedetails;

public class Logintestdetails {
	WebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";

	
	@BeforeTest
	public void envSetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void  loginPage() throws InterruptedException {
		Loginpagedetails  ob = new Loginpagedetails(driver);
		ob.setValue("aswajith@gmail.com", "aswajith@123");
		ob.submitClick();
		
	}
	
	@AfterTest
	public void browserClose() {
		driver.close();
	}
	
}
