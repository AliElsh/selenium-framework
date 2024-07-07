package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_Us_page extends Page_Base {

	public Contact_Us_page(WebDriver Driver) {
		super(Driver);

	}


	@FindBy(id ="FullName")
	WebElement Your_Name;

	@FindBy(id ="Email")
	WebElement Your_Email;

	@FindBy(id ="Enquiry")
	WebElement Your_Enq;

	@FindBy(name ="send-email")
	WebElement SubbmitBTN;

	@FindBy(css ="div.result")
	public WebElement mssg_aftr_eqn;

	public void Contact_US(String name,String mail,String enquiry)
	{
		Send_txt(Your_Name, name);
		Send_txt(Your_Email, mail);
		Send_txt(Your_Enq, enquiry);
		ClickButton(SubbmitBTN);
	}

}
