package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class And_Or {
	
	WebDriver  driver;
	String url = "https://www.facebook.com/";
	
	
	@Before
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void and_or() {
		driver.findElement(By.xpath("//input[@type = 'text' or @name='email']")).sendKeys("aswajith@123");
		driver.findElement(By.xpath("//input[@type= 'password' or @name='pass']")).sendKeys("aswajith");
		driver.findElement(By.xpath("//input[@type = 'text' and @name='email']")).click();
		
	}
	
	@After
	public void clsoe() {
		
		driver.close();
	}
	

}
