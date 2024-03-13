package com.org.requests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class TC_003_PUT_Request {   
	
	
	@Test (enabled = false)
	public void validate_Put_Request()
	{
		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParam = new JSONObject();
		
		requestParam.put("FirstName", "Rahul");
		requestParam.put("LastName", "Singh");
		requestParam.put("UserName", "RSingh");
		requestParam.put("Password", "RSingh1234");
		requestParam.put("Email", "Rsingh@gmail.com");
		
		request.header("Content-Type", "application/json");
		//request.contentType("application/json");
		
		request.body(requestParam.toJSONString());
		
		
		Response response = request.post("http://restapi.demoqa.com/customer/register");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);    

		ValidatableResponse validateResponse = response.then(); 
		validateResponse.statusCode(200);   
		validateResponse.contentType("application/xml");
		
		response.headers();
		
	}     

}
