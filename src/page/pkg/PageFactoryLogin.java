package page.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLogin {
	WebDriver driver;
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(id = "submit")
	WebElement submit;

	public PageFactoryLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setValues(String US, String Pass) throws InterruptedException {
		username.clear();
		username.sendKeys(US);
		Thread.sleep(2000);
		
		password.clear();
		password.sendKeys(Pass);
		
	}
	
	public void submit() {
		submit.click();
	}
	

}


