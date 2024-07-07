package utiliteis;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Helper {

	public static void Capture_Screen_Shoot(WebDriver Driver , String screenshotname)
	{

		// TAKE SCREEN SHOT WHEN PROGRAMMER IS "عااااااااااااااااااااااااااااااااار"
		Path destinstion=Paths.get("./Screen_Shots/", screenshotname+".png");
		try {
			Files.createDirectories(destinstion.getParent());
			FileOutputStream out=new FileOutputStream(destinstion.toString());
			out.write(((TakesScreenshot) Driver).getScreenshotAs(OutputType.BYTES));
			out.close();

		} catch (IOException e) {
		}

	}


}
