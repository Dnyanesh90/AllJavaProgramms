package Tutorial2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo4 {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000";
		RestAssured.basePath="/employees";

		RequestSpecification httpRequest = RestAssured.given();
		
		Response resp = httpRequest.get("/10");
		System.out.println(resp.getStatusCode());//200
		System.out.println(resp.getStatusLine());//HTTP/1.1 200 Ok
		
		resp = httpRequest.delete("/10");
		System.out.println(resp.getStatusCode());//200
		System.out.println(resp.getStatusLine());//HTTP/1.1 200 Ok
		
		resp = httpRequest.get("10");
		System.out.println(resp.getStatusCode());//404
		System.out.println(resp.getStatusLine());//HTTP/1.1 404 Not Found

	}

}
