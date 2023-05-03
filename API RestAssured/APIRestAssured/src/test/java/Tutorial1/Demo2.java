package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httpRequest =RestAssured.given();
		Response resp =httpRequest.get("/employees/11");
		int a= resp.getStatusCode();
		String b =resp.getStatusLine();
		long c =resp.getTime();
		String  d =resp.getBody().asString();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		if(d.contains("Dnyaneshwar"))
		{
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test Case is fail");
		}
		
		
		

	}

}
