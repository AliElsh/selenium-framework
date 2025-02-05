package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends Page_Base
{

	public ProductReviewPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "AddProductReview_Title")
	WebElement reviewTitleTxt;

	@FindBy(id = "AddProductReview_ReviewText")
	WebElement reviewText;

	@FindBy(id = "addproductrating_4")
	WebElement rating4RdoBtn;

	@FindBy(name = "add-review")
	WebElement submitReviewBtn;

	@FindBy(css = "div.result")
	public  WebElement reviewNotification;

	public void AddProductReview(String reviewTitle, String reviewMessage) {
		Send_txt(reviewTitleTxt, reviewTitle);
		Send_txt(reviewText, reviewMessage);
		ClickButton(rating4RdoBtn);
		ClickButton(submitReviewBtn);
	}
}
