package com.org.requests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class TC007_BasicAuth_Preemptive {
	
	@Test(enabled = false)
	public void validate_preemptive_BasicAuth()
	{
		int code = RestAssured.given()
				.auth()
				.preemptive()
				.basic("ss", "asdasd")
				.when()
				.get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=4a84cafd7b252812dcb9c5f96c23c31c")
				.getStatusCode();
		System.out.println(code);
		
		ValidatableResponse reponseBody = RestAssured.given()
				.when()
				.get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=4a84cafd7b252812dcb9c5f96c23c31c")
				.then()
				.header("Server", "openresty").statusCode(200);
				
			
		System.out.println(reponseBody.toString());
		
	}

}
