package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistration extends Page_Base {


	public UserRegistration(WebDriver Driver)
	{
		super(Driver);
	}

	@FindBy(id ="gender")
	WebElement Gender;
	@FindBy(id ="FirstName")
	WebElement F_Name;
	@FindBy(id ="LastName")
	WebElement L_Name;
	@FindBy(id ="Email")
	WebElement E_mail;
	@FindBy(id ="Password")
	WebElement P_assword;;
	@FindBy(id ="ConfirmPassword")
	WebElement Confirm_Password;
	@FindBy(id ="register-button")
	WebElement Reg_Button;
	@FindBy(css ="div.result") 
	public WebElement Sucssefull_massage;
	
	
	
	@FindBy(linkText="Log out")
	public WebElement Log_out;
	
	@FindBy(linkText="My account")
	 WebElement My_Account;
	
	public void User_reg(String fristname ,String lasttname,String mail ,String password)
	{
		ClickButton(Gender);
		Send_txt(F_Name,fristname);
		Send_txt(L_Name,lasttname);
		Send_txt(E_mail,mail);
		Send_txt(P_assword,password);
		Send_txt(Confirm_Password,password);
		ClickButton(Reg_Button);



	}
	public void logout() 
	{
		ClickButton(Log_out);

	}
	
	public void Open_Myaccount()
	{
		ClickButton(My_Account);
	}

	
}







