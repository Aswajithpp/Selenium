package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {
	
	WebDriver  driver;
	String url = "https://practicetestautomation.com/practice-test-login/";
	
	
	@Before
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	 @Test
	 public void absolutexpath() {
		 driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).clear();

		 driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/div[1]/input")).sendKeys("student");
		 driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/div[2]/input")).sendKeys("Password123");
		 driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
	 }
	 
	 @After
	 public void close() {
		 driver.close();
	 }
	 
	 

}
