package Tutorial4;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:3000";

		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.header("Content-Type","application/json");
		//httpRequest.contentType(ContentType.JSON);

		JSONObject json =new JSONObject();
		json.put("Firstname","Sangita");
		json.put("lastname","Kadam");
		json.put("Middlename","Vyankatrao");
		json.put("MobNo",942136489);
		json.put("EmailID","sangita@123");
		
		httpRequest.body(json.toString());
		
		Response resp=httpRequest.put("/employees/10");
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		
		//capture response payload --- First Name
		JsonPath respbody = resp.jsonPath();
		String a = respbody.getString("Firstname");
		System.out.println(a);
		long b = respbody.getLong("MobNo");
		System.out.println(b);
		
		System.out.println("-----------------------");
		
		String d = resp.getHeader("Content-Type");
		System.out.println(d);
		
		String e = resp.header("Content-Type");
		System.out.println(e);
		
		String c = resp.contentType();
		System.out.println(c);
		

	}

}
