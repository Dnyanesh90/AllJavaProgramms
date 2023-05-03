package Tutorial3;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Demo2 {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:3000";

		JSONObject json = new JSONObject();
		json.put("firstName", "Soham");
		json.put("lastName", "biradar");
		json.put("address", "pune");
		json.put("mobileNo", 909000);

		Response resp = 
				RestAssured
				.given()
				.header("Content-Type", "application/json")
				.body(json.toString())
				.post("/employees");

		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());

		JsonPath js = resp.getBody().jsonPath();
		String a = js.getString("firstName");
		System.out.println(a);

	}

}
