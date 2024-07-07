package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home_page;
import pages.My_Account_Page;
import pages.UserRegistration;
import pages.User_Login;

public class My_Account_Test extends Test_Base
{
	
		Home_page homeobject ;
		UserRegistration userobject;
		User_Login LoginObj;
		
		My_Account_Page accountobj;
		
		@Test(alwaysRun = true)
		public void User_REG_Secssfully() 
		{
			homeobject=new Home_page(Driver);
			userobject =new UserRegistration(Driver);

			homeobject.Open_Reg();
			userobject.User_reg("Ali", "mohamed", "Ali@gmail.com", "123456789");	
			assertEquals(userobject.Sucssefull_massage.getText(),"Your registration completed");


		}	
		
		
		@Test(dependsOnMethods = {"User_REG_Secssfully"})
		public void Rgsed_user_can_change_password() 
		{
			accountobj=new My_Account_Page(Driver);
			userobject.Open_Myaccount();
			accountobj.open_change_password();
			accountobj.Change_Password("123456789", "123456");
				
			assertEquals(accountobj.massage_content.getText(), "Password was changed");
			accountobj.closemassage();
		}
		
		@Test (dependsOnMethods = {"Rgsed_user_can_change_password"})
		public void REG_user_can_Logout() 
		{

			userobject.logout();
		}	
		
		
		@Test (dependsOnMethods = {"REG_user_can_Logout"})
		public void  REG_user_can_login() 
		{
			homeobject.Open_Login();
			
			LoginObj=new User_Login(Driver);

			LoginObj.UserLogin("Ali@gmail.com","123456");
		Assert.assertTrue(userobject.Log_out.isDisplayed());

		}	
		
}
