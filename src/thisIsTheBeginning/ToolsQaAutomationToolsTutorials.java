package thisIsTheBeginning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQaAutomationToolsTutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
 
driver.get("http://toolsqa.com/");
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
