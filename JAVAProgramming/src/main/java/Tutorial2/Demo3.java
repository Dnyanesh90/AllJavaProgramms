package Tutorial2;

public class Demo3 {

	public static void main(String[] args) {
		String a = "Good"; 
		String b = "morning"; 
		
		a=a+b;
  
	    b =a.substring(0,(a.length()-b.length()));    
	      
	    a =a.substring(b.length());    
	           
	    //System.out.println("Strings after swapping: " + a + " " + b);    

		
		System.out.println("String a = " +a);
		System.out.println("String b = " +b);
		

	}

}
