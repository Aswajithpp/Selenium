package javapkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		//connect browser
		WebDriver driver = new ChromeDriver();
		
		//url loading
		
		driver.get("https://www.google.com");
		
		//TitleVerification
		
		String expectedresult = "google";
		String actualresult = driver.getTitle();
		
	     System.out.println("Title is :"+actualresult);
	     
	     if(expectedresult.equalsIgnoreCase(actualresult)) {
	    	 System.out.println("Pass");
	     }
	     
	     else {
	    	 System.out.println("fail");
	     }
		
		

	}

}



