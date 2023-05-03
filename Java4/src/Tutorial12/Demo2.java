package Tutorial12;

public class Demo2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		try {
			System.out.println("try block is stared");
			int c = a / b;
			System.out.println(c);
			System.out.println("try block ended");
		}
		catch (ArithmeticException e) {
			int d =a*b;
			System.out.println(d);
			System.out.println("Exception occur");
		}
	}

}
