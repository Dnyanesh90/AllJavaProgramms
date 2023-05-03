package Tutorial2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo5 {

	public static void main(String[] args) {
        RestAssured.baseURI="http://localhost:3000";
		
		RestAssured.basePath="/employees";
		
		RequestSpecification httpRequest = RestAssured.given();

		Response resp = httpRequest.get("/16");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		
		resp = httpRequest.delete("/16");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		
		resp = httpRequest.get("/16");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
	}

}
