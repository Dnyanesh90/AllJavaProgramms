package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo7 {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:3000";

		RequestSpecification httpRequest = RestAssured.given();

		Response resp = httpRequest.get("/employees/14");

		int a = resp.getStatusCode();
		System.out.println(a);

		String b = resp.getStatusLine();
		System.out.println(b);

		String respbody = resp.getBody().asString();

		JsonPath json = new JsonPath(respbody);
		String c = json.getString("fname");
		System.out.println(c);

		int d = json.getInt("id");
		System.out.println(d);
		
		String e = resp.getHeader("Content-Type");
		System.out.println(e);

	}

}
