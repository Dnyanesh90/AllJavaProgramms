package Tutorial3;

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
		json.put("Firstname","Dnyaneshwar");
		json.put("Lastname","Kadam");
		json.put("Middlename","Vyankatrao");
		json.put("MobNo",750784787);
		json.put("EmailID","kadamdnyana@gmail.com");
		json.put("SSN",12345678);
		json.put("PostalCode",413532);
		json.put("Address","Pune");
		
		httpRequest.body(json.toJSONString());
		
		Response resp =httpRequest.post("/employees");
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getBody().asString());
		System.out.println(resp.getTime());
		System.out.println(resp.getContentType());
		System.out.println(resp.getSessionId());
		System.out.println(resp.getHeaders());
		
		
		

	}

}
