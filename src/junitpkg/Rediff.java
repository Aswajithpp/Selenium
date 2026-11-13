package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {
	
	WebDriver driver;
	String url ="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
   @Test
   public void dropdown() throws InterruptedException {
	   
	   
	WebElement day =   driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[1]"));
	
	Select  d = new Select(day);
	
	d.selectByIndex(11);
	
	Thread.sleep(3000);
	
	
	

//	WebElement month =   driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[2]"));
//
//	Select  m = new Select(month);
//	
//	m.selectByValue("12");
//	
	
	Select mnth=new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[2]")));
	mnth.selectByValue("11");
	
	Thread.sleep(3000);

	
//	WebElement year =   driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[3]"));
//
//	Select  y = new Select(year);
//	
//	y.selectByValue("2005");
	
	
	Select year=new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[3]")));
	year.selectByVisibleText("2008");
	Thread.sleep(3000);

	
   }
   
   
   
   
   
   @Test
   public void radiobutton() throws InterruptedException {
	WebElement ele =   driver.findElement(By.xpath("//form[@name='register_mail']/div/div[9]/div/label[2]"));
	
    Boolean gender = ele.isSelected();
    
    System.out.println("isSelected"+gender);
    
    if(gender!=true) {
    	ele.click();
    }
    
	Thread.sleep(3000);

	
	
	
//    
//   WebElement radiobtn = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[9]/div/label[2]"));
//   radiobtn.click();
//    
//   Thread.sleep(3000);
	
	
    
//    Boolean Gender = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[9]/div/label[2]"));
//    
//    if(!Gender) {
//    	System.out.println("Pass : selected");
//    }
//    
//    else {
//    	System.out.println("fail: selected ");
//    }
//    
    
	
   }
	
   
   
   @Test
   public void checkbox() throws InterruptedException {
	   
	WebElement checkbx =   driver.findElement(By.xpath("//form[@name='register_mail']/div/div[15]/div/input"));
	
	 Boolean cbox = checkbx.isSelected();
	    
	    System.out.println("isSelected"+cbox);
	    
	    if(cbox!=true) {
	    	checkbx.click();
	    }
		Thread.sleep(3000);

	   
   }
   
   
   
   @Test
   public void  buttonenablee() throws InterruptedException {
	   
//	 WebElement btnn =  driver.findElement(By.xpath("//*[@id='Register']"));
//	 Boolean bt = btnn.isEnabled();
//	 System.out.println("isSelected"+btnn);
//	    
//	    if(bt!=true) {
//	    	btnn.click();
//	    }
//	    
	    
	   WebElement button= driver.findElement(By.id("Register"));
		boolean enable=button.isEnabled();
		System.out.println("Is Enabled : "+enable);
		if(enable!=true) {
			button.click();
		}
	    
		Thread.sleep(3000);

	  
   }
   
   
   
   
   
   @Test
   public void logovisible() {
	   
	WebElement logo = driver.findElement(By.xpath("/html/body/div/div[1]/div/a/img"));
	 boolean log = logo.isDisplayed();
	   
	System.out.println("Logo is "+logo);
	
	if(log==true) {
		System.out.println("logo is visible");
			
		}
	
	else {
		System.out.println("logo is not visible");
	}
   }
	
   
   

   @After
   public void tabclose() {
	   driver.close();
	   
   }
   
}
	
	
   
	
	


	
   

