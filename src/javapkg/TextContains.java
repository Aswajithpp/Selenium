package javapkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 
		 String src = driver.getPageSource();
		 if(src.contains("About")) {
			 System.out.println("pass: Text contains");
		 }
		 else {
			 System.out.println("Fail: Text is not contains ");
		 }
		 driver.close();
	}

}
