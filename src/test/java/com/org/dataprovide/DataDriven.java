package com.org.dataprovide;

import org.testng.annotations.DataProvider;

public class DataDriven {
	
	@DataProvider(name = "empData")
	public String[][] getExcelData()
	{
		String[][] dataExcel = {
				{"Rahul1","1234","34"},
				{"Rahul2","0987","33"},
				{"Rahul3","3456","99"}
		};
		
		return dataExcel;
	}

}
