package XYZ;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("MMS");

		String a = null;

		try {
			System.out.println("try block is started");
			int b = a.length();
			System.out.println(b);
			System.out.println("try block is ended");

		} 
		catch (NullPointerException e) {
			System.out.println("catch block of code");
			//e.printStackTrace();
		}

		System.out.println("MME");

	}

}
