package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page extends Page_Base{

	public Home_page(WebDriver Driver) 
	{
		super(Driver);
		jse=(JavascriptExecutor) Driver;
	}

	@FindBy(linkText = "Register")
	WebElement Reglink;
	
	@FindBy(linkText = "Log in")
	WebElement Log_in;
	
	@FindBy(linkText = "Contact us")
	WebElement Contact_Us;
	
	public void Open_Reg() 
	{
		ClickButton(Reglink);
	}
	public void Open_Login() 
	{
		ClickButton(Log_in);
	}
	public void Open_Contact_us() 
	{
		ClickButton(Contact_Us);
	}
	
}
