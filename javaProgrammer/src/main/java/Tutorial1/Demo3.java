package Tutorial1;

public class Demo3 {

	public static void main(String[] args) {
		int abc = 123456, reverse = 0;  
		//we have not mentioned the initialization part of the for loop  
		for( ;abc != 0; abc=abc/10)   
		{  
		int remainder = abc % 10;  
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println( + reverse); 

	}

}
