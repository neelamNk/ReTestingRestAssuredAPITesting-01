package BaseTest;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import Utils.ExtentReportsListner;
import Utils.FileAndEnviroment;
import io.restassured.RestAssured;
@Listeners(ExtentReportsListner.class)
public class BaseTesting extends  ExtentReportsListner {
	
	@BeforeTest
	public void baseTest() throws IOException  {
		/*System.out.println(FileAndEnviroment.AndFileEnv().get("serverulr"));
		//System.out.println(FileAndEnviroment.AndFileEnv().get("portNo"));
		
		 int a = 10;
	        int b = 20;

	        int sum = a + b;

	        test.log(LogStatus.INFO, "Test has been started....");
	        test.log(LogStatus.PASS, "Test has been passed");
	        test.log(LogStatus.PASS, "My sum value is " + sum);
	        test.log(LogStatus.FAIL, "My sum value is " + sum);
	        test.log(LogStatus.INFO, "Test has been completed....");
	        */
		RestAssured.baseURI ="http://localhost:3000/";
		RestAssured.baseURI = FileAndEnviroment.AndFileEnv().get("serverulr");
		
		
	    }
	}


