package tests;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import Pages.Login_page;
import TestBAse.TestBase;

public class Login_page_test extends TestBase{
	
	@Test
	 public  void init() throws Exception {
		 super.Launchurl();
		
		Login_page login = PageFactory.initElements(driver, Login_page.class);
		
		login.setUserName("Admin");
		login.setPassword("Admin123");
login.setWard();
login.setlogin();
		
	}
	
	

}
