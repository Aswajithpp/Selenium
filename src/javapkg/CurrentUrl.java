package javapkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String actualresult = driver.getCurrentUrl();
		System.out.println("current url:"+actualresult);
		
		if(actualresult.equals("https://www.google.com")) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}

	}

}


