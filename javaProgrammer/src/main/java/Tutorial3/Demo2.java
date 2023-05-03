package Tutorial3;

public class Demo2 {

	public static void main(String[] args) {
		String s[] = "Welcome to java".split(" "); 
	      String ans = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	        ans += s[i] + " "; 
	      } 
	      System.out.println(""+ ans); 

	}

}
//OUTPUT-java to Welcome 