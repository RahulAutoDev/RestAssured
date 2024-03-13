package com.org.requests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC005_BasicAuth {
	
	@Test(enabled = false)
	public void validate_basicAuth()
	{
//		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication";
//		
//		PreemptiveBasicAuthScheme basicAuth = new PreemptiveBasicAuthScheme();
//		basicAuth.setUserName("ToolsQA");
//		basicAuth.setPassword("TestPassword");
//		RestAssured.authentication = basicAuth;
//		
		RequestSpecification request = RestAssured.given();
		
		//Response response = request.request(Method.GET, "/");
		Response response = request.get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=4a84cafd7b252812dcb9c5f96c23c31c");
		
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		Headers allHeaders = response.headers();
		
		for(Header headData : allHeaders)
		{
			Assert.assertEquals(headData.getName(), "Server22");
			int code = response.getStatusCode();
			System.out.println(code);
		}
		
		
		
		
	}
	
	
	

}
