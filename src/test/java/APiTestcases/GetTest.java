package APiTestcases;

import org.testng.annotations.Test;


import BaseTest.BaseTesting;
import EndPoint.ApiPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetTest extends BaseTesting{
	@Test
	public void getAPItest() {
		RestAssured.given().when().get(ApiPath.apiPath.Get_list_of_post).then().log().all();
		
//	          Response responce = RestAssured.given().when().get(ApiPath.apiPath.Get_list_of_post);
//	          System.out.println(responce.contentType());
//	          System.out.println(responce.getStatusCode());
//	          System.out.println(responce.getTime());
//	          System.out.println(responce.getCookies());
//	          System.out.println(responce.getBody().asString());
	}
	

}
