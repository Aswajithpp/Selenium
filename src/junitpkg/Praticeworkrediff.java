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
import org.openqa.selenium.support.ui.Select;

public class Praticeworkrediff {

	WebDriver driver;
	String url = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before 
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void  fullName() throws InterruptedException {
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[2]/input")).sendKeys("Aswajith pp");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[3]/div/input")).sendKeys("aswajithpp");
		Thread.sleep(3000);
        WebElement search = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[4]/input"));
        search.click();
        Thread.sleep(3000);
	}
	@Test
	public void password() throws InterruptedException {
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[6]/div/input")).sendKeys("Aswajith@2004");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[7]/div/input")).sendKeys("Aswajith@2004");
		Thread.sleep(3000);
	}
	@Test 
	public void dropDown() throws InterruptedException {
		
		WebElement day = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[1]"));
	Select dy = new Select(day);
	
    dy.selectByIndex(25);
    Thread.sleep(3000);
    
    Select mnth = new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[2]")));
    mnth.selectByValue("08");
    Thread.sleep(3000);
    Select yr = new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[3]")));
    yr.selectByVisibleText("2004");
    Thread.sleep(3000);	
	}
	@Test

	public void radioButton() throws InterruptedException {
//		WebElement radio = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[9]/div/label[2]"));
//		Boolean gender = radio. isSelected();
//		System.out.println("isSelected"+gender);
//		if(gender!=true) {
//			
//			radio.click();
//			
//		}
		
		WebElement radioo = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[9]/div/label[1]"));
		radioo.click();
		Thread.sleep(3000);
	}
	
	@Test
	public void checkBox() throws InterruptedException {
		
		WebElement check = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[15]/div/input"));
		check.click();
		Thread.sleep(3000);
		
	}
	
	@Test
	
	public void dropdown1() throws InterruptedException {
		
		WebElement country = driver.findElement(By.id("country"));
		Select coun = new Select(country);
		coun.selectByVisibleText("India");
		Thread.sleep(3000);
		Select yr = new Select(driver.findElement(By.xpath("//*[@id='div_city']/div[1]/select[1]")));
	    yr.selectByVisibleText("Mysore");
		Thread.sleep(3000);
	
	}

	@Test
	public void number() throws InterruptedException {

		    driver.findElement(By.id("mobno")).sendKeys("8075538471");

		    Thread.sleep(3000);
		}
	
	@Test
	
	public void linkscount() {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("linkscount"+li.size());
		for(WebElement data : li) {
			 String links = data.getAttribute("href");
			 String linkText = data.getText();
			System.out.println("linkTest"+links);
			
			verify(links);
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
