package Excellll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.xmlbeans.XmlException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StartingExcell2 {

	public static File newFile;
	public static FileInputStream fileStream;
	public static XSSFWorkbook filebook;
	public static XSSFSheet fileSheet;
	public static XSSFRow fileRow;
	public static XSSFCell fileCell;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//String value=excelss(0,0);
		//System.out.println(value);
		System.out.print(excelss(0,1));
		
		
		
		
		
		
	}
public static String excelss(int row,int column) throws IOException{
	// step 1 creating new file for excell
	newFile= new File("/Users/weqashaq/Desktop/ExcelDay1.xlsx");
	//step 2 running the file and making it
	fileStream= new FileInputStream(newFile);
	//step 3 this will run the excel
	filebook= new XSSFWorkbook(fileStream);
//fileSheet.
	//step 4 this is navagating to the sheet
	fileSheet= filebook.getSheet("Sheet1");

	//Step 5 within the sheet there are rows, you specify the row you want to pull
	fileRow=fileSheet.getRow(row);
	//Step 6 this will go after the row and pull the column and pull which column you want to pull from
	fileCell=fileRow.getCell(column);
	//this will the value in which is present in the cell
	String fileString= fileCell.getStringCellValue();
	//this is for pulling boolean if it was true or false
	//boolean fileBoolean=fileCell.getBooleanCellValue();
	int hello=fileSheet.getLastRowNum();
	return fileString;
	
	
}
}
