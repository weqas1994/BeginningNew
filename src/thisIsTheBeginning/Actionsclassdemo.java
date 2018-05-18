package thisIsTheBeginning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionsclassdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		 Actions makeActions= new Actions(driver);
		//WebElement parentmenu= driver.findElement(By.xpath("//span[contains(.,'DEMO SITES')]"));
		makeActions.moveToElement(driver.findElement(By.xpath("//span[contains(.,'DEMO SITES')]"))).build().perform();
		Thread.sleep(3000);
	System.out.println("this is displayed "+driver.findElement(By.xpath("//span[contains(.,'DEMO SITES')]")).isDisplayed());
		
		
	}

}
