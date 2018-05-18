package thisIsTheBeginning;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQaNewWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
 
driver.get("http://toolsqa.com/automation-practice-switch-windows/");

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

driver.findElement(By.cssSelector("button[onclick='newBrwWin()']")).click();


String parent=driver.getWindowHandle();
Set<String>newWindow=driver.getWindowHandles();
for(String window:newWindow) {
	driver.switchTo().window(window);
	WebDriverWait wait=new WebDriverWait(driver,30);
	WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[style='color: #3366ff;']")));

	//WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("branding")));
	if(element.isDisplayed()) {
		System.out.println("Is Displayed");
	}else {
		System.out.println("is Not Displayed");
	}
}

	}

}
