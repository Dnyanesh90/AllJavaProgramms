package Tutorial5;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.contentType(ContentType.JSON);
		JSONObject json = new JSONObject();
		json.put("Firstname", "Savita");
		json.put("EmailID", "Kadam@1323");

		httpRequest.body(json.toString());

		Response resp = httpRequest.patch("/employees/10");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getTime());

		String a = resp.jsonPath().getString("Firstname");
		System.out.println(a);

		String b = resp.jsonPath().getString("EmailID");
		System.out.println(b);
	}

}
