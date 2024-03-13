package com.org.requests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_Post_Request {
	 
	@Test
	public void validate_Post_Request()
	{
		RequestSpecification request = RestAssured.given();
		request.body("{\n" + 
				"    \"name\": \"morpheus\",\n" + 
				"    \"job\": \"leader\"\n" +  
				"}");
		request.contentType("application/json"); 
		Response response = request.post("https://reqres.in/api/users");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		int code = response.getStatusCode();
		System.out.println(code); 
		System.out.println(response.jsonPath().get("name"));
		//Assert.assertEquals(response.jsonPath().get("name"), "ABC");
		
		Headers allHeaders = response.headers();
		
		for(Header allHeader: allHeaders)
		{
			System.out.println(allHeader.getName());
		}
		
	}   
	
	

}
