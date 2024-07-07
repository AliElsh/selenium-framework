package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Search_Page;
import pages.Searched_page;

public class Search_Product_Using_Auto_Suggastion extends Test_Base 
{
	
	String nameoffproduct="Mac";
	Search_Page searchobj;
	Searched_page product_obj;
	
	@Test
	public void Product_search_auto_suggest()
	{
		searchobj=new Search_Page(Driver);
		product_obj =new Searched_page(Driver);
		searchobj.Product_Search_Using_Auto_Suggest(nameoffproduct);
	Assert.assertEquals(product_obj.Element_search_auto_suggest.getText(),"Apple MacBook Pro 13-inch");
	}
	
	
	
	
	

}
