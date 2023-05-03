package Tutorial12;

public class Demo4 {

	public static void main(String[] args) {

		String a = "selenium";
		try {
			int b = Integer.parseInt(a);
			System.out.println(b);
		} 
		catch (Exception e) {
			System.out.println("Exception occur");
		}
	}

}
