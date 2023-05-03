package Tutorial1;

public class Demo2 {

	public static void main(String[] args) {
		int abc = 987654, reverse = 0;  
		while(abc != 0)   
		{  
		int remainder = abc % 10;  
		reverse = reverse * 10 + remainder;  
		abc = abc/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}
