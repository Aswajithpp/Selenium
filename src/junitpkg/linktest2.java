package junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktest2 {
	
	
	WebDriver driver;
//	   String url ="https://www.qapractice.com/";
	   
//	   String url = "https://rahulshettyacademy.com/AutomationPractice/";
	
	String url = "https://github.com/";
	
//	String url ="https://www.amazon.in";
	
	   


	@Before
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test
	public void linktest() {
		
		 List<WebElement> li = driver.findElements(By.tagName("a"));
		 System.out.println("link count"+li.size());
		 for(WebElement data : li) {
			 String link = data.getAttribute("href");
			 String linktext = data.getText();
			System.out.println("linkTest"+link);
		 }
	}
		 
	
		 
	@After
	public void close() {
		driver.close();
	}

}

