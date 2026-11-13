package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_id {
	
	WebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";
	
	@Before
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginvalidation() throws InterruptedException {
		//username
		
		
		driver.findElement(By.name("username")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);

		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);


	}
	
	
	
	@Test
	public void titleverification() {
		String expectedresult = "Text Login";

		String actualresult = driver.getTitle();
		if(actualresult.equals(expectedresult)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
	}
	
	
	
	@After
	public void close() {
		driver.close();
	}
	
}
