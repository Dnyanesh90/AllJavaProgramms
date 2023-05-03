package Tutorial1;

public class Semo4 {

	public static void main(String[] args) {
		String s[] = "you shall not pass".split(" "); 
	      String a = ""; 
	      for (int i = s.length - 1; i >= 0; i--)
	      { 
	        a+= s[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + a); 
	    }
	}



