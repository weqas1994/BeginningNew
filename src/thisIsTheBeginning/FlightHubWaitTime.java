package thisIsTheBeginning;


import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightHubWaitTime {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://flighthub.com");
		driver.findElement(
				By.cssSelector("input[value='Washington, United States - Washington Dulles International (IAD)']"))
				.clear();
		driver.findElement(
				By.cssSelector("input[value='Washington, United States - Washington Dulles International (IAD)']"))
				.sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath("//*[@id=\"btn-search-flight\"]")).click();

		/*driver.findElement(By.xpath("//input[@placeholder='Going to']")).sendKeys("LAS");
		driver.findElement(By.xpath("//*[@id=\"segments-wrap\"]/div[1]/div[3]/div[1]/div[2]/input")).click();
		TakingScreenShot.ScreenShot(driver, "thisWillBeThe3");
		driver.findElement(By.xpath("//*[@id='datepicker']/div/div[1]/table/tbody/tr[3]/td[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"segments-wrap\"]/div[1]/div[3]/div[2]/div[2]/input")).click();
		TakingScreenShot.ScreenShot(driver, "thisWillBeThe2");
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]/div/div[1]/table/tbody/tr[4]/td[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"passengers_select\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"home-passengers-container\"]/div[1]/div[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"home-passengers-container\"]/div[5]/a")).click();
		driver.findElement(By.xpath("//span[@class='class-slide-trigger']")).click();
		driver.findElement(By.xpath("//a[@data-seat-type='First']")).click();
		 driver.findElement(By.xpath("//*[@id=\"btn-search-flight\"]")).click();
		TakingScreenShot.ScreenShot(driver, "thisWillBeTheFIrst");
		
		
		String parent = driver.getWindowHandle();
		System.out.println("parent window is id:" + parent);
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total windows" + count);
		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child object window swutched ..");
				System.out.println("waiting for 30 seconds ");
				WebDriverWait wait = new WebDriverWait(driver, 30);
				WebElement element = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.className("amatrix-top-wrap")));
				if (element.isDisplayed()) {
					System.out.println("pass");
				} else {
					System.out.println("fail");
					
				
				}
			}
		}

		// WebDriverWait wait = new WebDriverWait(driver, 30);WebElement element =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains('Have
		// a favorite airline?')]")));boolean elementStatus =
		// element.isDisplayed();if(elementStatus) {System.out.println("True");} else
		*/// {System.out.println("False");}
	}
}
