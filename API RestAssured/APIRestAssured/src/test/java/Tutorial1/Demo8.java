package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo8 {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:3000";

		RequestSpecification httpRequest = RestAssured.given();

		Response resp = httpRequest.get("/employees/3");

		int a = resp.getStatusCode();
		System.out.println(a);

		String b = resp.getStatusLine();
		System.out.println(b);

		JsonPath json = resp.getBody().jsonPath();

		String c = json.getString("fname");
		System.out.println(c);

		int d = json.getInt("id");
		System.out.println(d);
		
		String e = resp.getHeader("Content-Type");
		System.out.println(e);
	}

}
