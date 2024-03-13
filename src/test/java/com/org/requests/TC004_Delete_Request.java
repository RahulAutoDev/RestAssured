package com.org.requests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class TC004_Delete_Request {
	
	
	@Test(enabled = false)
	public void validate_Delete_Request()
	{
		RequestSpecification request = RestAssured.given();
		Response response = request.delete("https://reqres.in/api/users/2");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		int CodeVal = response.statusCode();
		System.out.println(CodeVal); 
		
		ValidatableResponse validateResponse = response.then();
		validateResponse.statusCode(200);
		validateResponse.contentType("application/xml");
	}     
	
	

}
