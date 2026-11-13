package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonwork {

    
    WebDriver driver;
    String url = "https://www.amazon.in/";
    
    @Before
    public void envsetup() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    
    @Test
    public void search() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
    	
    	Thread.sleep(2000);
    	
    	WebElement search = driver.findElement(By.id("nav-search-submit-button"));
    	Thread.sleep(2000);
    	
    	 search.click();
    	 Thread.sleep(2000);
   
    }
    
    @Test
    public void signin() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
    	
    	
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id='ap_email_login']")).sendKeys("aswajithpp45@gmail.com");    	
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//*[@id='continue']")).click();
    	Thread.sleep(3000);
    	
    	driver.navigate().to("https://www.amazon.in/");
    
    }
    
    @Test 
    public void deals() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id='nav-xshop']/ul/li[5]/div/a")).click();
    	Thread.sleep(3000);
    }
    
    @Test
    public void cart() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id='nav-cart']")).click();
    	Thread.sleep(3000);
    
    }
    
    @Test
    public void All() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
    	Thread.sleep(2000);
    	
    	driver.navigate().to("https://www.amazon.in/");
    	
    }
   
    @Test
    public void titleverification() throws InterruptedException{
        String expectedtitle = "Amazon";

        String actualtitle = driver.getTitle();
        System.out.println("actualtitle"+actualtitle);

        if(expectedtitle.equals(actualtitle)) {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        Thread.sleep(3000);
    }

    @Test
    public void currenturl() throws InterruptedException {
        String expecturl = "https://www.amazon.in/";

        String actualurl = driver.getCurrentUrl();
        System.out.println("actualurl"+actualurl);
        
        if(actualurl.equals(expecturl)) {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        
        Thread.sleep(3000);
    }

    @Test
    public void pagesource() throws InterruptedException {
        
        String src = driver.getPageSource();
        if(src.contains("Amazon")) {
            System.out.println("pass : Text contain");
        }
        else {
            System.out.println("fail : Text contain");
        }
        Thread.sleep(3000);
    
    }
    
    @Test
    public void linkcount() {
    	  List<WebElement> li = driver.findElements(By.tagName("a"));
    	System.out.println("link count"+li.size());
    	for(WebElement data : li) {
    		String link  = data.getAttribute("href");
    		String linktext = data.getText();
    		System.out.println("links"+link);
    		System.out.println("linktext"+linktext);
    		
    		verify(link);
    	}
    	
    }
    
    
    public void verify(String u) {
		try {
			URL ul = new URL(u);
			HttpURLConnection con = (HttpURLConnection) ul.openConnection();
			con.setConnectTimeout(3000);
			con.connect();
			
			if(con.getResponseCode()==200) {
				System.out.println("valid = "+u);
			}
			
			else {
				System.out.println("invalid = "+u);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
	}

}
    
    @After
    public void tabclose() {
    	driver.close();
    }
    
}
    
    