package thisIsTheBeginning;





import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;



public class UtilityScreenShot(String hello) {
	public static void ScreenShotCapture(WebDriver driver) {

		try { 
	TakesScreenshot screenshotobj=(TakesScreenshot)driver;
	
	File source =screenshotobj.getScreenshotAs(OutputType.FILE);

	FileUtil.copyFile(source,new File("./Screenshots/"+hello+".png"));
}catch(Exception e) {
	System.out.println(e.getMessage());
}

}
}