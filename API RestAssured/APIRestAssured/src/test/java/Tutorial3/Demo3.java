package Tutorial3;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo3 {

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
				.post("/employees")
				.then().log().all().extract().response();

	}

}
