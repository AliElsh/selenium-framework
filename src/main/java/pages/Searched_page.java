package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searched_page extends Page_Base {

	public Searched_page(WebDriver Driver) {
		super(Driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	public WebElement current_item;
	
	@FindBy(css= "strong.current-item")
	public WebElement Element_search_auto_suggest;
	

}
