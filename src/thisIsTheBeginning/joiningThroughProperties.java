package thisIsTheBeginning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class joiningThroughProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Step 1
		Properties webprop=new Properties();
		
		//Step2
		FileInputStream ThisIsForProperties =new FileInputStream("/Users/weqashaq/Desktop/eclipse/Beginnings/src/ThisIsForProperties/FirstFile.properties");
		webprop.load(ThisIsForProperties);
		
		if (webprop.getProperty("Username").equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/weqashaq/Desktop/Driver/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.get(webprop.getProperty("url"));
			driver.findElement(By.id("edit-name")).click();

			driver.findElement(By.id("edit-name")).sendKeys(webprop.getProperty("name"));
			driver.findElement(By.id("edit-pass")).sendKeys(webprop.getProperty("password"));
			driver.findElement(By.xpath("//*[@id='edit-submit']")).click();
		}else {

			
			System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get(webprop.getProperty("url"));
			driver.findElement(By.className("input[name='name']")).sendKeys(webprop.getProperty("name"));

		}
		
		
	}

}
