package Tutorial12;

public class Demo3 {

	public static void main(String[] args) {

		String a = null;

		try {
			@SuppressWarnings("null")
			int b = a.length();
			System.out.println(b);
		} 
		catch (Exception e) {
		//e.printStackTrace();
			System.out.println("Exception occur");
		}

		System.out.println("MME");
	}

}
