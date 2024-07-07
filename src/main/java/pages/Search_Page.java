package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Page extends Page_Base{

	public Search_Page(WebDriver Driver) {
		super(Driver);
	}
	@FindBy(id = "small-searchterms")
	WebElement Search_txt_Box;

	@FindBy(css= "button.button-1.search-box-button")
	WebElement search_button;

	@FindBy(id = "ui-id-1")
	List<WebElement> Auto_Suggetion;


	public void Product_Search(String pro_name) 
	{
		Send_txt(Search_txt_Box, pro_name);
		ClickButton(search_button);
	}
	public void Product_Search_Using_Auto_Suggest(String pro_name) 
	{
		Send_txt(Search_txt_Box, pro_name);
		 Auto_Suggetion.get(0).click();
	}
	
	
}
