package testNGpkg;


import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2google {

	WebDriver driver;
	String url = "https://www.google.com";

	@BeforeTest
	public void browsersetup() {
		
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlsetup() {
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void titleverification() {
		String actualresult = driver.getTitle();
		String expectedresult = "Google";
		if(actualresult.equals(expectedresult)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		}
		
	
		@Test
		public void currenturl() {
			String actualurl = driver.getCurrentUrl();
			String expecturl = "https://www.google.com";
			if(actualurl.equals(expecturl)) {
				System.out.println("pass");
			}
			else {
				System.out.println("fails");
			}
		}
		
		
	  @Test
	public void opensource() {
				
	String src = driver.getPageSource();
	if(src.contains("About")) {
	System.out.println("pass : Text contain ");
}
	else {
	System.out.println("fail: Text contain ");
   }
			}
		
	
  @Test
  public void buttonEnable() throws InterruptedException {
	  WebElement button= driver.findElement(By.xpath("//input[@name='btnK']"));
		boolean enable=button.isEnabled();
		System.out.println("Is Enabled : "+enable);
		if(enable!=true) {
			button.click();
		}
	    
		Thread.sleep(3000);

  }
 
	@Test 
	public void screenShot() throws IOException, InterruptedException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("D:\\Automation\\Screenshot\\Google.jpg"));
        Thread.sleep(3000);
	}
	
	@Test
	public void elementScreenShot() throws IOException, InterruptedException {
	    WebElement ele = driver.findElement(By.xpath("//div[@class='naW5gc uZekje']//*[name()='svg']"));
	    File src = ele.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File("D:\\Automation\\Screenshot\\Textbox.png"));
	    Thread.sleep(3000);
	}
			
	@Test
	public void googlesearch() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Books" ,Keys.ENTER);
		Thread.sleep(3000);
	
	}
	
	@Test
	public void brokenlinks() {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("total number of links:"+li.size());
		for(WebElement data:li) {
			String links = data.getAttribute("href");
			String linktext = data.getText();
			System.out.println("links"+links);
			System.out.println("linktext"+linktext);
			
			verify(links);
			
		}
		
	}
	
	public void verify (String u) {
		try {
			
			URL ul = new URL(u);
			HttpURLConnection con = (HttpURLConnection) ul.openConnection();
			con.setConnectTimeout(3000);
			con.connect();
			
			if(con.getResponseCode()==200) {
				System.out.println("valid "+u);
			}
			else {
				System.out.println("invalid"+u);
			}
			
			
		}
		catch (Exception e) {
		}
	}
	
	@Test 
	public void logovisible() {
		WebElement logo = driver.findElement(By.xpath("//div[@class='naW5gc uZekje']//*[name()='svg']"));
		boolean log = logo.isDisplayed();
		System.out.println("logo"+logo);
		if(log==true) {
			System.out.println("logo is visible");
		}
		else {
			System.out.println("logo is not visible");
		}
	}
		
	
//	@AfterMethod
//	
//	public void tabclosing() {
//		driver.close();
//	}
//	
//	@AfterTest
//	public void browserclosing() {
//    driver.close();		
//	}

}


