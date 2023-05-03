package Tutorial1;

public class Demo2 {

	public static void main(String[] args) {
		String a = "Java123is456fun789";
	    
	    String b = "\\d+";

	    System.out.println(a.replaceAll(b, " "));

	}

}
