import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmHomework {

	public static FileInputStream OgFile;
	public static 	File newFile;
    public static XSSFWorkbook Fbook;
    public static XSSFSheet FSheet;
	public  static XSSFRow FRow;
	public static XSSFCell FCell;

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
	 
		System.setProperty("webdriver.chrome.driver", "/Users/weqashaq/Desktop/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		String Username = ExcelHW(0, 0);
		String Password = ExcelHW(0, 0);
		System.out.println(Username);
		System.out.println(Password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(Username);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(Password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		FileOutputStream outStream=new FileOutputStream("/Users/weqashaq/Desktop/Book1.xlsx");
		Fbook.getSheetAt(0).getRow(0).createCell(2).setCellValue(2);
		Fbook.getSheetAt(0).getRow(1).createCell(2).setCellValue(3);
		Fbook.write(outStream);
		//FileOutputStream outStream=new FileOutputStream(newFile);
		//Fbook.write(outStream);
		Fbook.close();
		
	}

	public static String ExcelHW(int row, int column) throws IOException  {
		File newFile = new File("/Users/weqashaq/Desktop/Book1.xlsx");
		// FileUtils destinationFile=new FileUtils();
		FileInputStream OgFile = new FileInputStream(newFile);
		XSSFWorkbook Fbook = new XSSFWorkbook(OgFile);
		XSSFSheet FSheet = Fbook.getSheetAt(0);
		XSSFRow FRow = FSheet.getRow(row);
		XSSFCell FCell = FRow.getCell(column);
	//this is another way to write it out
		System.out.println(Fbook.getSheetAt(0).getRow(0).getCell(0));
	
		
		return FCell.getStringCellValue();
		
		
	}

}
