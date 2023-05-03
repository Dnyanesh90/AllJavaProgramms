package POJO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo6 {

	public static void main(String[] args) throws JsonProcessingException {
		//POJO Method chaining concept with Builder design pattern
				GoogleAccount1 obj1 = new GoogleAccount1()
						.setFirstName("Anjali")
						.setLastName("Kale")
						.setUsername("Anjali@gmail.com")
						.setPasswd("Anjali@123")
						.setConfirmPasswd("Anjali@123");
				
						

			

				ObjectMapper mapper = new ObjectMapper();
				String a =mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1);
				System.out.println(a);
				
	}

}
