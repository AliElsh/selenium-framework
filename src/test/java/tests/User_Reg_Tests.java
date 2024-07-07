package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home_page;
import pages.UserRegistration;
import pages. User_Login;

public class User_Reg_Tests extends Test_Base 
{
	Home_page homeobject ;
	UserRegistration userobject;
	User_Login LoginObj;
	@Test(alwaysRun = true)
	public void User_REG_Secssfully() 
	{
		homeobject=new Home_page(Driver);
		userobject =new UserRegistration(Driver);

		homeobject.Open_Reg();
		userobject.User_reg("Ali", "mohamed", "Alielshekh@gmail.com", "123456789");	
		assertEquals(userobject.Sucssefull_massage.getText(),"Your registration completed");


	}	
	@Test (dependsOnMethods = {"User_REG_Secssfully"})
	public void REG_user_can_Logout() 
	{

		userobject.logout();
	}	

	@Test (dependsOnMethods = {"REG_user_can_Logout"})
	public void  REG_user_can_login() 
	{
		homeobject.Open_Login();
		
		LoginObj=new User_Login(Driver);

		LoginObj.UserLogin("Alielshekh@gmail.com","123456789");
	Assert.assertTrue(userobject.Log_out.isDisplayed());

	}	













}
