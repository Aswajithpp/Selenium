package testNGpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionClass {
	
	WebDriver driver;
	String url = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeMethod
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void keyBoardEvents() throws InterruptedException {
	//fullname field
	WebElement fullname =	driver.findElement(By.xpath("//form[@name='register_mail']/div/div[2]/input"));
	fullname.sendKeys("Aswajith pp");
		
    WebElement mailid =	driver.findElement(By.xpath("//form[@name='register_mail']/div/div[3]/div/input"));
   
	Actions act = new Actions(driver);
	//select text 
	act.keyDown(fullname,Keys.CONTROL).sendKeys("a");
	//copy text
	act.keyDown(fullname,Keys.CONTROL).sendKeys("c");
	//paste
	act.keyDown(mailid,Keys.CONTROL).sendKeys("v");
	
	act.build().perform();
	Thread.sleep(3000);
	
	
	
	}
	@AfterMethod
	public void tabclose() {
		driver.close();
	}

}
