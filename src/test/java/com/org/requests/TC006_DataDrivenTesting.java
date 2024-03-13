package com.org.requests;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.org.dataprovide.ReadWriteExcelData;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC006_DataDrivenTesting {
	
	
	/*@Test(dataProvider="empData")
	public void validate_Req_By_DataDriven(String Name, String Salary, String Age)
	{
		RequestSpecification htmlRequest = RestAssured.given();
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", Name);
		jsonObj.put("salary", Salary);
		jsonObj.put("age", Age);
		
		htmlRequest.body(jsonObj.toJSONString());
		
		htmlRequest.header("Content-Type","application/json");
		
		Response response = htmlRequest.post("https://dummy.restapiexample.com/api/v1/create");
		String responseBody = response.getBody().asString();
		
		System.out.println(responseBody);
		System.out.println(response.statusCode());
	} */
	
	@DataProvider(name = "empData")
	public Object[][] getExcelData()
	{
		Object[][] dataReadExcel = ReadWriteExcelData.read_fromExcel();
		
//		String[][] dataExcel = {
//				{"Rahul1","1234","34"},
//				{"Rahul2","0987","33"},
//				{"Rahul3","3456","99"}
//		};
//		
//		return dataExcel;
		
		return dataReadExcel;
	}
	
	

}
