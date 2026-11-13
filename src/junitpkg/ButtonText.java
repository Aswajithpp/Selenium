package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonText {

	
	WebDriver driver;
//	String url = "https://www.google.com";
	
	@Before
	public void envsetup() {
		
		driver = new ChromeDriver();
//		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void testverify() {
		
	driver.get("https://www.google.com");
	WebElement search =	driver.findElement(By.name("btnK"));
//		String btntext = search.getAttribute("value");
		String btntext = driver.findElement(By.name("btnK")).getAttribute("value");
		System.out.println("button text = "+btntext);
		
		//text verification
		if(btntext.equals("Google Search")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
	}
	
	
	@Test
	public void submitbutton() {
		 driver.get("https://practicetestautomation.com/practice-test-login/");
		String btnTxt = driver.findElement(By.id("submit")).getText();
		System.out.println("text is : "+btnTxt);
		 

			if(btnTxt.equals("Submit")) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			
	}
	

	@After
	public void tabclose() {
		driver.close();
	}
}
