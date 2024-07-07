package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Search_Page;
import pages.Searched_page;

public class Search_product_Test extends Test_Base{
	
	String nameoffproduct="Apple MacBook Pro 13-inch";
	Search_Page searchobj;
	Searched_page product_obj;
	
	@Test
	public void Product_search()
	{
		searchobj=new Search_Page(Driver);
		product_obj =new Searched_page(Driver);
		searchobj.Product_Search(nameoffproduct);
	Assert.assertEquals(product_obj.current_item.getText(),nameoffproduct);
	}
	

}
