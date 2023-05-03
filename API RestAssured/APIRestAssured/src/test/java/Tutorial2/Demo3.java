package Tutorial2;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo3 {

	public static void main(String[] args) {
		//https://reqres.in/api/users/2
		
				RestAssured.baseURI="https://reqres.in";
				
				RequestSpecification httpRequest = RestAssured.given();
				
				Response resp = httpRequest.delete("/api/users/8");
				
				Headers allheader = resp.getHeaders();

				for(Header abc: allheader)
				{
					String d = abc.getName();//it will print all Key name
					String e = abc.getValue();//it will print all values
					
					System.out.println(d + " :: "+e);
				}

	}

}
