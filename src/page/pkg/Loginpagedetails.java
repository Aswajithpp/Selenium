package page.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpagedetails {
	WebDriver driver;
	
	By username = By.name("username");
	By password = By.name("password");
	By submit = By.id("submit");
	
	public Loginpagedetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public void setValue(String US, String Pass) throws InterruptedException {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(US);
		Thread.sleep(2000);
		
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(Pass);
	}
	
		
	public void submitClick() {
		driver.findElement(submit).click();
	}
}
