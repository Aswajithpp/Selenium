package testNGpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	WebDriver driver;
	String url = "https://demo.automationtesting.in/Datepicker.html#google_vignette";
	 @BeforeTest
	    public void browserSetUp() {
	        driver = new ChromeDriver();
	        
	    }
	 
	  @BeforeMethod
	    public void urlSetUp() {
	       driver.get(url);
	       driver.manage().window().maximize();
	        }
	  @Test
	  public void datePickerEnable() throws InterruptedException {


	      driver.findElement(By.xpath("//*[@id='datepicker2']")).sendKeys("09/30/2026");
	      Thread.sleep(3000);

	      driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/a[2]")).click();

	  }
	   
	   @Test
	   public void dateDisable() throws InterruptedException {

		   driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
	       Thread.sleep(3000);

	       while(true) {

	           String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	           if(month.equals("November")) {
	               break;
	           }
	           else {
	               driver.findElement(By.xpath("//a[@title='Next']")).click();
	           }
	       }

	       List<WebElement> dateList = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a") );
           for (WebElement dateElement : dateList) {
           String date = dateElement.getText();
           System.out.println(date);
           if(date.equals("13")) {
	           dateElement.click();
	               break;
	           }
	           
	       }
	       
	   }
	       
	   
	   @AfterTest
	   public void tabclose() {
		   driver.close();
	   }
	   
}         
	       
	   