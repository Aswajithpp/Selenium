package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathwork {

	
	WebDriver  driver;
	String url = "https://www.amazon.in";
	
	
	@Before
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void xpath() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='nav-xshop']/ul/li[11]/div/a")).click();
	}
}
	



