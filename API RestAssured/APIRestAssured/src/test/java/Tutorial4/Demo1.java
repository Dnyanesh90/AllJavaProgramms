package Tutorial4;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httpRequest =RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		JSONObject json =new JSONObject();
		json.put("Firstname","Rohini");
		json.put("lastname","yeware");
		json.put("Middlename","Suryankant");
		json.put("MobNo",809007065);
		json.put("EmailID","Rohini@123");
		
		httpRequest.body(json.toString());
		
		Response resp =httpRequest.put("/employees/10");
		 System.out.println(resp.getStatusCode());
		 System.out.println(resp.getStatusLine());
		 System.out.println(resp.contentType());
		 System.out.println(resp.getBody().asString());
		
		
		
		

	}

}
