package thisIsTheBeginning;





import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;



public class TakingScreenShot {

	

	public static void ScreenShot(WebDriver driver,String screenshotName) {

		

		try {

			TakesScreenshot screenshotObj =  (TakesScreenshot)driver;

			File source = screenshotObj.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File("/Users/weqashaq/Desktop/eclipse/Beginnings/folders"+screenshotName+".png"));

			} catch(Exception e) {

				System.out.println(e.getMessage());

				}

	}



}