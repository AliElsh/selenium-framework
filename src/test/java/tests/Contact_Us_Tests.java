package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.Contact_Us_page;
import pages.Home_page;

public class Contact_Us_Tests extends Test_Base
{

	Contact_Us_page contact_OBJ;
	Home_page home_obj;
	String name="Ali";
	String mail="ali1@gmail.com";
	String enq="hello";
	
	@Test
	public void Contact_US()
	{
		home_obj =new Home_page(Driver); 
		contact_OBJ=new Contact_Us_page(Driver);
		 
		home_obj.Scroll();
		home_obj.Open_Contact_us();
		contact_OBJ.Contact_US(name, mail, enq);
		
	assertEquals(contact_OBJ.mssg_aftr_eqn.getText(),
			"Your enquiry has been successfully sent to the store owner.");
	}
	
}
