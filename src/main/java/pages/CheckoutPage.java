package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends Page_Base
{
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "input.button-1.checkout-as-guest-button")
	private WebElement guestBtn;

	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement fnTxt;

	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lnTxt;

	@FindBy(id = "BillingNewAddress_Email")
	private WebElement emailTxt;

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countryList;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneTxt;

	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTxt;

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement addressTxt;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement postCodeTxt;

	@FindBy(xpath = "//*[@id=\'billing-buttons-container\']/input")
	private WebElement continueBtn;

	@FindBy(id = "shippingoption_1")
	private WebElement shippingMethodRdo;

	@FindBy(xpath = "//*[@id=\'shipping-method-buttons-container\']/input")
	private WebElement continueShippingBtn;

	@FindBy(xpath = "//*[@id=\'payment-method-buttons-container\']/input")
	private WebElement continuePaymentBtn;

	@FindBy(xpath = "//*[@id=\'payment-info-buttons-container\']/input")
	private WebElement continueInfoBtn;

	@FindBy(css = "a.product-name")
	public WebElement prodcutName;

	@FindBy(css = "input.button-1.confirm-order-next-step-button")
	private WebElement confirmBtn;

	@FindBy(css = "h1")
	public WebElement ThankYoulbl;

	@FindBy(css = "div.title")
	private WebElement successMessage;

	@FindBy(linkText = "Click here for order details.")
	private WebElement orderDetailsLink;


	public void RegisteredUserCheckoutProduct(String countryName, String address, 
			String postcode, String phone, String city, String productName) throws InterruptedException {
		select = new Select(countryList);
		select.selectByVisibleText(countryName);
		Send_txt(cityTxt, city);
		Send_txt(addressTxt, address);
		Send_txt(postCodeTxt, postcode);
		Send_txt(phoneTxt, phone);
		ClickButton(continueBtn);
		ClickButton(shippingMethodRdo);
		ClickButton(continueShippingBtn);
		Thread.sleep(1000);
		ClickButton(continuePaymentBtn);
		Thread.sleep(1000);
		ClickButton(continueInfoBtn);
	}

	public void confirmOrder() throws InterruptedException 
	{
		ClickButton(confirmBtn);
		Thread.sleep(2000);
	}

	public void viewOrderDetails() {
		ClickButton(orderDetailsLink);
	}


	public void CheckoutProduct(String firstName, String lastName, String countryName,
			String email, String address, String postcode, 
			String phone, String city, String productName) throws InterruptedException {
		Send_txt(fnTxt, firstName);
		Send_txt(lnTxt, lastName);
		Send_txt(emailTxt, email);
		select = new Select(countryList);
		select.selectByVisibleText(countryName);
		Send_txt(cityTxt, city);
		Send_txt(addressTxt, address);
		Send_txt(postCodeTxt, postcode);
		Send_txt(phoneTxt, phone);
		ClickButton(continueBtn);
		ClickButton(shippingMethodRdo);
		ClickButton(continueShippingBtn);
		Thread.sleep(2000);
		ClickButton(continuePaymentBtn);
		Thread.sleep(2000);
		ClickButton(continueInfoBtn);
	}
}
