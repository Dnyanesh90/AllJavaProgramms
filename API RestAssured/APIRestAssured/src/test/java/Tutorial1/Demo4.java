package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo4 {

	public static void main(String[] args) {
		// step 1: Specify the Base URI in Rest Assured.
				RestAssured.baseURI = "http://localhost:3000";

				// Step 2: get the Request Specification Object to hit different types of HTTP
				// Request.

				RequestSpecification httpRequest = RestAssured.given();

				// step 3: select the HTTP GET Request from the Request Specification object,
				Response resp = httpRequest.get("/employees/16");

				// step 4: capture status code.
				int a = resp.getStatusCode();
				System.out.println(a);
				
				// step 5: capture Status Line
				String b = resp.getStatusLine();
				System.out.println(b);
				
				// step 6: capture Content-Type Headers
				
				String c = resp.getHeader("Content-Type");
				System.out.println(c);
				
				
				//step 7: capture single value from response body
				String respbody = resp.getBody().asString();
				
				JsonPath json=new JsonPath(respbody);
				
				String d = json.getString("lname");
				System.out.println(d);
				
				String e = json.getString("address");
				System.out.println(e);
				
				long f = json.getLong("mobileNo");
				
				System.out.println(f);

	}

}
