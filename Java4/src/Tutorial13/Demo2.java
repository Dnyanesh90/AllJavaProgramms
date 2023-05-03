package Tutorial13;

public class Demo2 {

	public static void main(String[] args) {

		String a = "selenium";

		try {
			int b = Integer.parseInt(a);
			System.out.println(b);
		} 
		finally {
			System.out.println("Finally block");
		}
	}

}
