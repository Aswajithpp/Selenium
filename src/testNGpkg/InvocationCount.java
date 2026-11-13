package testNGpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@BeforeTest
	public void BrowsersetUp() {
		System.out.println("Browser loading");
	}
	@BeforeMethod
	public void urlSetUp() {
		System.out.println("Url Loading");
	}
	@Test
	public void titleVerification() {
		System.out.println("title..");
	}
	@Test(invocationCount = 2)
	public void currentURL() {
		System.out.println("current url loading...");
	}
	@Test(priority = -1)
	public void pageSource() {
		System.out.println("page contains");
	}
	@Test
	public void screenshot() {
		System.out.println("take screenshot");
	}
	@Test
	public void BrokenLinks() {
		System.out.println("brocken link");
	}
	@Test
	public void RadioButton() {
		System.out.println("button");
	}
	@Test (priority = 1)
	public void Dropdown() {
		System.out.println("dropdown list");
	}
	
	@AfterMethod
	public void TabClosing() {
		System.out.println("Tab` closing");
	}
	@AfterTest
	public void BrowserClosing() {
		System.out.println("browser closing");
	}

}