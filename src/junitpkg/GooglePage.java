package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {
	WebDriver driver;
	@Before
	public void envsetup() {
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void titleverification() {
		String actualresult = driver.getTitle();
		String expectedresult = "Google";
		if(actualresult.equals(expectedresult)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		}
		
	
		@Test
		public void currenturl() {
			String expecturl = "https://www.google.com";
			String actualurl = driver.getCurrentUrl();

			if(actualurl.equals(expecturl)) {
				System.out.println("pass");
			}
			else {
				System.out.println("fails");
			}
		}
		
			@Test
			public void opensource() {
				
				String src = driver.getPageSource();
				if(src.contains("About")) {
					System.out.println("pass : Text contain ");
				}
				else {
					System.out.println("fail: Text contain ");
				}
			}
			
			@After
			public void close() {
				driver.close();
			}
			
}	
			
		
		
	


