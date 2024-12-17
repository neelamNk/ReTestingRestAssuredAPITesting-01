package FunctionalTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestAutomation {
	@Test
	public void getReqAutiomation() {
		RestAssured.baseURI ="https://reqres.in/api/users";
	Response response = RestAssured. given() .param("page", "2") .when().get();
	System.out.println( "getBody:" +response.getBody());
	System.out.println( "statusCode:" +response.statusCode());
	System.out.println( "contentType:" +response.contentType());
	System.out.println( "getTime:" +response.getTime());
	System.out.println( "cookies:" +response.cookies());
	System.out.println( "cookies:" +response.cookies());
	System.out.println( "cookies:" +response.prettyPrint());
		
		
		//ONE WAY
		/*
		 * RestAssured. given() .param("page", 2) .when().get() .then() .assertThat()
		 * .log() .all() .statusCode(200);
		 */
	}

}
