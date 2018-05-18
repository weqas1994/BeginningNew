package Excellll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StartingExcell {

	public static FileInputStream fis;
	public static XSSFWorkbook workBook;
	public static XSSFSheet worksheet;
	public static XSSFRow workrow;
	public static XSSFCell workcell;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//step 1 get the file and 
	String value = Excellsheets(0,1,1);
		System.out.println("the value at row 0 and column 0"+value);
			String value1 = Excellsheets(0,2,1);
			System.out.println("the value at row 0 and column 1"+value1);
			
		System.out.println("the value at row 1 and column 1"+	StartingExcell.Excellsheets(1, 1,1));
//String value=workcell.getStringCellValue();
//
////step 8 is you displaying this data type in the console
//System.out.println(value);
////this will give you how many rows are taken
//System.out.println(worksheet.getLastRowNum());	
//		//this is making a variable for all the rows
//int allrows=worksheet.getLastRowNum();
//workBook.getSheetAt(1);
////this will run and loop it till all the rows are met and displayed
//for (int a=0 ; a< allrows; a++) {
//	worksheet.getRow(a).getCell(0).getStringCellValue();//this is getting all the rows,but column would be on zero
//	
}
		
		
		
		
	
public static String Excellsheets(int rownum, int column,int sheet) throws IOException {
	File fileSource= new File("this will be where i want to put the file.xlsx");
	
	//step 2 this is opening the excell
fis=new FileInputStream(fileSource);
//step 3 this would be you acually specifying the excell class
workBook=new XSSFWorkbook(fis);
//step 4 this is what sheet your pulling off--if you renamed the sheet you would put the string name
worksheet= workBook.getSheetAt(sheet);
//step 5 is you getting the row
workrow=worksheet.getRow(rownum);

//step 6 is what column your getting it from
workcell=workrow.getCell(column);
//step 7 is you getting the data from that cell, if it was boolean, or int,or double you would choose that options
//String value=workcell.getStringCellValue();

	return  workcell.getStringCellValue();
}
}
