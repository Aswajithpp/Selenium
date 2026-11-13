package testNGpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pdf {
	WebDriver driver;
	String url = "https://www.ilovepdf.com/word_to_pdf";
	
	@BeforeMethod
	public void envsetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void pdfUpload()  throws AWTException {
//	WebElement pdfup=	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/a[1]"));
//	pdfup.click();
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/a[1]")).click();
	fileUplaodCod("D:\\Resume\\ASWAJITH_PP.pdf"); 
	}
	
	public void fileUplaodCod(String file) throws AWTException {
		StringSelection strSelection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		Robot robot = new Robot();
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	@AfterMethod
	public void tabclose() {
		driver.close();
	}
}



		
	
