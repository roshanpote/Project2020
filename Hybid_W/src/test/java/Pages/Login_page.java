package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page {

	WebDriver driver;

	public void OPENMR(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(id = "username")

	WebElement Username_Box;

	@FindBy(id = "password")
	WebElement Password_box;

	@FindBy(id = "Inpatient Ward")
	WebElement Select_ward;

	@FindBy(id = "loginButton")
	WebElement login_button;

	public void setUserName(String username) {

		Username_Box.sendKeys(username);
	}

	public void setPassword(String password) {
		Password_box.sendKeys(password);
	}

	public void setWard() {
			
			Select_ward.click();		
		}

	public void setlogin()
	{
		login_button.click();
	}
	
	
	}
