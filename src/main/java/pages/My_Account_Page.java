package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Account_Page extends Page_Base {

	public My_Account_Page(WebDriver Driver)
	{
		super(Driver);
	}

	@FindBy(linkText="Change password")
	WebElement change_password;
	
	@FindBy(id ="OldPassword")
	WebElement old_password;
	
	@FindBy(id ="NewPassword")
	WebElement new_password;
	
	@FindBy(id ="ConfirmNewPassword")
	WebElement confirm_password;
	
	@FindBy(css ="button.button-1.change-password-button")
	WebElement chng_pssd_btn;
	
	
	@FindBy(className ="close")
	WebElement closs;
	
	@FindBy(className ="content")
	public WebElement massage_content;

	public void open_change_password() 
	{
		ClickButton(change_password);
	}
	
	public void closemassage() 
	{
		ClickButton(closs);
	}
	
	
	public void Change_Password(String old_pass,String new_pass)
	{
		
		Send_txt(old_password, old_pass);
		Send_txt(new_password, new_pass);
		Send_txt(confirm_password, new_pass);
		ClickButton(chng_pssd_btn);
		
	}
	
	
	
}
