package thisIsTheBeginning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertForQatools {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
 
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		driver.findElement(By.id("alert")).click();
		//driver.findElement(By.id("timingAlert")).click();
		//Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
		
	}

}
