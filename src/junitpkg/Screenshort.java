package junitpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort {
	
	WebDriver  driver;
	String url = "https://www.google.com/";
	
	
	@Before
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void pageScreenshot() throws IOException {
	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File("D:\\Automation\\Screenshot\\Google.png"));
	    
	    System.out.println("Page screenshot taken successfully");
	}

	@Test
	public void elementScreenshot() throws IOException {
		WebElement ele = driver.findElement(By.xpath("//textarea[@id='ti6dpd']"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\Automation\\Screenshot\\full name.png"));
		
	    System.out.println("Element screenshot taken successfully");
	}
	
	@After
	public void close() {
		driver.close();
	}
}




