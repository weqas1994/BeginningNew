import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class yoyo {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		Actions makeActions= new Actions(driver);
		Thread.sleep(3000);
		WebElement parentmenu= driver.findElement(By.cssSelector("span[contains(.,'DEMO SITES')]"));
		makeActions.moveToElement(parentmenu).build().perform();
		
		
	}

}
