package javapkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	  driver.get("https://www.facebook.com");
	  driver.close();
	  
	  driver = new EdgeDriver();
	  driver.get("https://www.amazon");
	  driver.close();

	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.ebay.com");
	  driver.close();

	 


	  
		

	}

}
