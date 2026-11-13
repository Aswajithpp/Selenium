package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {

	
	WebDriver driver;
	
	String url = "https://practicetestautomation.com/practice-test-login/";
	
	@Before
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void relativepath() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
	}
	
	 @After
	 public void close() {
		 driver.close();
	 }
	 
}


