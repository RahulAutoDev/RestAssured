package com.org.requests;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;



public class TC009_OAuth2 {
	
	
	@Test(enabled = false)
	public void validate_OAuth2()
	{
		Response response = RestAssured.given()
		.auth()
		.oauth2("64d6507a372e5430feb4b10dd2aa82c5656eb4a9")
		.post("http://coop.apps.symfonycasts.com/api/2077/barn-unlock");
		
		
		System.out.println(response.getBody().asPrettyString());
		
		System.out.println("Json path value: " + response.jsonPath().get("message"));
		
		
	}

}
