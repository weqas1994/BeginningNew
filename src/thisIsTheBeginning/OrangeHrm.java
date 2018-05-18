package thisIsTheBeginning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {
//System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");

//WebDriver driver = new ChromeDriver();

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://opensource.demo.orangehrmlive.com");
//WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
driver.get("http://opensource.demo.orangehrmlive.com");

driver.findElement(By.id("txtUsername")).sendKeys("admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin");
driver.findElement(By.className("button")).click();

driver.findElement(By.id("menu_pim_viewPimModule")).click();
driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("weqas");
driver.findElement(By.id("menu_pim_viewPimModule")).click();
driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("weqas");
driver.findElement(By.name("btnAdd")).click();
driver.findElement(By.name("firstName")).sendKeys("weqas");
driver.findElement(By.name("lastName")).sendKeys("haq");

driver.findElement(By.id("btnSave")).click();
		
String urlHrm= driver.getCurrentUrl();
System.out.println("the link to the profile is: "+urlHrm);

driver.findElement(By.cssSelector("input[value='Edit']")).click();
driver.findElement(By.cssSelector("[id='personal_optGender_1']")).click();
Thread.sleep(2000);
//*[@id="personal_txtLicExpDate"]
driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).clear();
driver.findElement(By.xpath("//*[@id='personal_txtLicExpDate']")).sendKeys("2019-08-23");
//driver.findElement(By.id("btnSave")).click();
		//System.out.println();
WebElement nationality = driver.findElement(By.id("personal_cmbNation"));
Select nationalitydropdown=new Select(nationality);
//System.out.println(nationalitydropdown);
WebElement selectvalue=nationalitydropdown.getFirstSelectedOption();

System.out.println(selectvalue.getText());
List<WebElement>nationalityList=nationalitydropdown.getOptions();
System.out.println(nationalityList.size());

int totalNationality=nationalityList.size();
System.out.println(totalNationality);

for(WebElement eleLoop: nationalityList) {
	String nationalitlyName=eleLoop.getText();
	System.out.println(nationalitlyName);
	
	
}

//nationalitydropdown.getAllSelectedOptions()
	}
	
}
	//System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");

	//WebDriver driver; //= new ChromeDriver();

	

