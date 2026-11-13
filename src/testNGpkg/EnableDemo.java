package testNGpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EnableDemo {
@BeforeTest 
	
	public void browsersetup() {
		System.out.println("Browser loading");
	}
	
	@BeforeMethod
	public void urlsetup() {
		System.out.println("url loading");
	}

	@Test
	public void titleverification() {
		System.out.println("");
	}
	
	@Test
	public void currenturl() {
		System.out.println("current url");
	}
	
	@Test
	
	public void pagesource() {
		System.out.println("page source");
	}
	
	@Test
	public void screenshot() {
		System.out.println("take screenshot");
	}
	
	@Test(priority = 1, enabled = false)
	public void brokenlinks() {
		System.out.println("broken links");
	}
	
	@Test
	public void dropdown() {
		System.out.println("brop down");
	}
	
	@AfterMethod
	
	public void tabclosing() {
		System.out.println("tab closing");
	}
	
	@AfterTest
	public void browserclosing() {
		System.out.println("browser closing");
		
	}
}




