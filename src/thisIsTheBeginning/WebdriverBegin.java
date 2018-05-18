package thisIsTheBeginning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBegin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.gecko.driver","/Users/weqashaq/Desktop/Driver/geckodriver");
		//WebDriver driver=new FirefoxDriver();
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://google.com");
//		driver.findElement(By.cssSelector("#lst-ib")).sendKeys("arif");
//		driver.findElement(By.className("gb_P")).click();
//		driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
//		driver.findElement(By.id("identifierId")).sendKeys("weqas1994");
//		driver.findElement(By.className("CwaK9")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@aria-label='Phone number or email']")).sendKeys("weqas1994@gmail.com");
//driver.findElement(By.className("CwaK9")).click();
//Thread.sleep(3000);
//driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("weqas");
//driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("haq");
//Thread.sleep(3000);
//driver.findElement(By.className("CwaK9")).click();
		driver.
		driver.get("http://google.com");

		driver.findElement(By.cssSelector("a[title='Google apps']")).click();
		
				
	}

}
