package javapkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadDifferent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver =new ChromeDriver();
      driver.get("https://www.google.com");
      
      EdgeDriver driver1=new EdgeDriver();
      driver1.get("https://www.google.com");
     
      FirefoxDriver driver2=new FirefoxDriver();
      driver2.get("https://www.google.com");
	}

}