package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EmailPage extends Page_Base{

	public EmailPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "FriendEmail")
    private WebElement emailFriendTxt;

    @FindBy(id = "PersonalMessage")
    private WebElement personalMessageTxt;

    @FindBy(name = "send-email")
    private WebElement sendEmailBtn;
    
    @FindBy(css = "div.result")
    public WebElement messageNotification;
    
    public void SendEmailToFriend(String friendEmail, String personalMessage) {
        Send_txt(emailFriendTxt, friendEmail);
        Send_txt(personalMessageTxt, personalMessage);
        ClickButton(sendEmailBtn);
    }
}
