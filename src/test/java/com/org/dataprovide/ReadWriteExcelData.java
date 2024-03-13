package com.org.dataprovide;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadWriteExcelData {
	
	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook myExcel;
	public static XSSFSheet mySheet;
	public static XSSFRow row;
	
	@DataProvider(name = "readfromexcel")
	public static Object[][] read_fromExcel()
	{
		file = new File("/Users/rahulsingh/Desktop/MyComputer/Automation/RestAssuredDataRead.xlsx");
		
		try {
			fis = new FileInputStream(file);
			myExcel = new XSSFWorkbook(fis);
			mySheet = myExcel.getSheet("Sheet1");

			} catch (IOException e) {
				e.printStackTrace();
			}

		int rowCount = mySheet.getPhysicalNumberOfRows();
		row = mySheet.getRow(0);
		int colCount = row.getLastCellNum();
		XSSFCell Cell;
		
		Object data[][]= new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<colCount; j++)
			{
				XSSFRow rowNum = mySheet.getRow(i);
				Cell = rowNum.getCell(j);
				data[i-1][j] = Cell.getRawValue();
			}
		}
		
		return data;
	}
	
	

}
