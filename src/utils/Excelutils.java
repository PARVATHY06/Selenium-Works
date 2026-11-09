package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils 
{
	//This method reads data from an excel sheet and returns it as a 2D Object array (object[][])
	public static Object[][] getTestData(String filePath,String sheetName) throws IOException 
	{
		FileInputStream fis=new FileInputStream(filePath); //read ExcelPath
		XSSFWorkbook workbook=new XSSFWorkbook(fis); //get excel workbook
		XSSFSheet  sheet = workbook.getSheet(sheetName);//to get the sheet
		
		int rows= sheet.getLastRowNum(); //excluding header
		int cols = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);
		
		Object[][] data  = new Object[rows][cols]; //create 2d object array,it can store multiple rows
		DataFormatter formatter = new DataFormatter(); //converts all cell values to string format
		
		
		for(int i=1;i<=rows;i++) //start from 1(skipping header)
		{
			for(int j=0;j<cols;j++)
			{
				data[i-1][j] = formatter.formatCellValue(sheet.getRow(i).getCell(j)); //data[i-1]-->[0][0] ,first index position
			}
		}
		
		workbook.close();
		fis.close();
		
		return data;
	}
	
	//Object is the superclass of all classes in java.Since every class implicitly extends object,
	//an Object reference can hold values of any data type,such as String,Integer,Double,or Boolean
	
	//Excel numeric values are returned as double by default.
	//DataFormatter converts the cell value into a formatted String and preserves how it is displayed in Excel
	//For example,it returns "1234" Instead of 1234.0
}
