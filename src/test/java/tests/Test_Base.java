package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utiliteis.Helper;

public class Test_Base {

	public static WebDriver Driver;
	@BeforeSuite
	public void startdriver() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
				"/resource/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Driver.navigate().to("https://demo.nopcommerce.com/");
		
	}
	@AfterSuite
	public void stopdriver()
	{

		Driver.quit();
	}
	
	@AfterMethod
	public void Take_Screen_Shot(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			Helper.Capture_Screen_Shoot(Driver, result.getTestName());
		}
		
	}
	

}
