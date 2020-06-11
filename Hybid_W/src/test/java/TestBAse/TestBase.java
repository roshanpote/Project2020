package TestBAse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	 public static WebDriver driver = null;
	@BeforeSuite
	public void Launchurl() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ShriGajanan\\Desktop\\Req Soft\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
	}
		@AfterSuite
		public void Close_Url() {
			driver.quit();
			
		}
		
		
	
}
