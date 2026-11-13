package testNGpkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTesting {
  WebDriver driver;
  String url = "https://practicetestautomation.com/practice-test-login/";
  
  @BeforeTest
  public void envSetup() {
	  driver = new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	 
  }
  
  @Test
  public void datadriven() throws IOException, InterruptedException {
	  FileInputStream f = new FileInputStream("D:\\Automation\\Loginpage.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(f);
	  XSSFSheet sh = wb.getSheet("Sheet1");
	  
	  int row = sh.getLastRowNum();
	  
	  for(int i=1; i<=row;i++) {
		  
	  
		  String username = sh.getRow(i).getCell(0).getStringCellValue();
		  System.out.println("username: "+username);
		  
		  String password = sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("password: "+password);
		  
		  driver.findElement(By.name("username")).clear();
		  
		  driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(3000);
			
		  driver.findElement(By.name("password")).clear();
		   
		  driver.findElement(By.id("password")).sendKeys(password);
			Thread.sleep(2000);

		  driver.findElement(By.id("submit")).click();
		  
          
	  }
		  
 
  }
	  
	  @AfterTest
	  public void tabClose() {
		  driver.close();
	  }
  

}
