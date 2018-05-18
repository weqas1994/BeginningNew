package thisIsTheBeginning;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QaWaitWithExplicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
 
driver.get("http://toolsqa.com/automation-practice-switch-windows/");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
TakingScreenShot.ScreenShot(driver, "NavigatedtoToolsQaSwitchWindow");
driver.findElement(By.cssSelector("button[onclick='newBrwTab()']")).click();
//driver.findElement(By.cssSelector("span[style='position: absolute; z-index: 1; left: 0px; top: 0px; overflow: hidden; border-radius: 6px; opacity: 1; transition: none;']"));
String parent=driver.getWindowHandle();
Set<String> obj1=driver.getWindowHandles();
int count=obj1.size();
for (String obj2 : obj1) {
	if(!parent.equalsIgnoreCase(obj2)) {
		driver.switchTo().window(obj2);
		System.out.println("waiting 30 seconds");
		System.out.println("Child Object switched windows");
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tp-kbimg")));
		if(element.isDisplayed()){
			System.out.println("element is present");
		}else {
				System.out.println("element is not present");
Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.cssSelector("button[onclick='newBrwTab()']"))).
		}
		TakingScreenShot.ScreenShot(driver, "ThisIsTheNewTab");
	}
}
		
		
	}

}
