package Tutorial13;

public class Demo1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		try {
			System.out.println("try block is started");
			int c = a / b;
			System.out.println(c);
			System.out.println("try block ended");
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception occur");
		} 
		finally {
			System.out.println("finally block of code");
		}
	}

}
