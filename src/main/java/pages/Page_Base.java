package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_Base {

	protected WebDriver Driver;
	JavascriptExecutor jse;
	Select select;
	
	//Paramtrize constructor
	public 	Page_Base(WebDriver Driver) 
	{
		PageFactory.initElements(Driver, this);
	}
	
	protected static void ClickButton(WebElement button)
	{
		button.click();
	}
	protected static void Send_txt(WebElement Element,String Value ) 
	{
		
		Element.sendKeys(Value);
	}

	public void Scroll()
	{
	//	Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//jse=(JavascriptExecutor) Driver;
		jse.executeScript("scrollBy(0,2500)");
		
	}
	
}
