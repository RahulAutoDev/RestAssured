package com.org.requests;

import org.testng.annotations.Test;

import com.org.base.Base;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static com.org.util.Property.prop;

public class T001_Get_Request extends Base{
	
	@Test(enabled = false)
	public void GetRequestDetails()
	{
		report.createTest("GetRequestDetails");
		//prop.getProperty("");
		RequestSpecification request = RestAssured.given();
		Response response = request.get("https://reqres.in/api/unknown");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		String res = RestAssured.given().body("").params("","").
				when().put().then().log().ifStatusCodeIsEqualTo(200)
				.assertThat().statusCode(200).extract().body().asString();
		JsonPath json = new JsonPath(res);
		json.getString("data.find({it.id=10})");
		
		

	} // https://petstore.swagger.io/v2/pet/findByStatus
	//          https://reqres.in/api/users?page=2
	
	@Test(enabled = false)
	public void validate_GetRequestById()  
	{ 
		RequestSpecification request = RestAssured.given();
		//request.pathParam("id", 2);
		//Response response = request.get("https://reqres.in/api/users?page={id}");
		Response response = request.get("https://maps.googleapis.com");
		JsonPath jsonPath = response.jsonPath();
		
		String responseBody = response.getBody().asString();
		
		
		
		
		System.out.println(jsonPath.get());
		System.out.println(responseBody);
//		System.out.println(response.getStatusLine());
//		System.out.println(response.getStatusCode());  
//		Headers allHeadersName = response.headers();
//		
//		for(Header heardersName : allHeadersName)
//		{
//			System.out.println(heardersName.getName() + " " + heardersName.getValue());
//		}
	}

}
