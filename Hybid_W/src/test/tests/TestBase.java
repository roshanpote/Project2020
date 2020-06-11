package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBase {
  
	WebDriver driver;
	
	@Test
  
  public void openBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver",
				"C://Users//ShriGajanan//Downloads//Compressed//chromedriver_win32//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
  }
}
