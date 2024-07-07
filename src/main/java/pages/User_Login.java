package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Login extends Page_Base{

	public User_Login(WebDriver Driver) {
		super(Driver);

	}
	@FindBy(id = "Email")
	WebElement mail;

	@FindBy(id = "Password")
	WebElement pass;


	@FindBy(css ="button.button-1.login-button")
	WebElement loginButton;

	public void UserLogin(String mymail,String password )
	{
		Send_txt(mail, mymail);
		Send_txt(pass, password);
		ClickButton(loginButton);

	}


}
