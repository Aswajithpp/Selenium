package junitpkg;


import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTagName {
	
	WebDriver driver;
   String url ="https://www.google.com";
   


@Before
public void envsetup() {
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}

@Test

public void link() {
	
	 List<WebElement> li = driver.findElements(By.tagName("a"));
	 System.out.println("link count"+li.size());
	 for(WebElement data : li) {
		 String links = data.getAttribute("href");
		 String linkText = data.getText();
		System.out.println("linkTest"+links);
	 }
}
	 
	 
	


@After
public void tabclose() {
	driver.close();
}
}