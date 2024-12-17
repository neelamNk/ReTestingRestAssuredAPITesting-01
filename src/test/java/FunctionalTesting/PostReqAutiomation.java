package FunctionalTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostReqAutiomation {
	
	 String json = "{\r\n"
	 		+ "    \"name\": \"morpheus\",\r\n"
	 		+ "    \"job\": \"leader\"\r\n"
	 		+ "}";
@Test
	public void getReqAutiomation() {
		RestAssured.baseURI ="https://reqres.in/api/users";
		
		RestAssured.given().body(json).when().post().then().log().all().statusCode(201);
	}
}
