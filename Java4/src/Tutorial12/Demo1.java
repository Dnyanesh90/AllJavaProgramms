package Tutorial12;

public class Demo1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		try {
			System.out.println("try block is stared");
			int c = a / b;
			int d =a*b;
			System.out.println(c);
			System.out.println(d);
			System.out.println("try block ended");
		}
		catch (ArithmeticException e) {
			System.out.println("Exception occur");
			
			int f= a+b;
			System.out.println(f);
		}

	}

}
