package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttext{
	WebDriver driver;
	String url = "file:///D:/Automation/Selenium/alert.html";
	
	@Before
	public void enSetUp() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void absoluteXpath() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert alt = driver.switchTo().alert();
		String actualtext = alt.getText();
		System.out.println("Text is : "+actualtext);
		
		if(actualtext.equals("Hello alert box")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		alt.accept(); // to click OK
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Aswajith");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("pp");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}
	

}

