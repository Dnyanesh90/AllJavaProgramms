package ExceptionHandling;

public class Demo7 {

	public static void main(String[] args) {
		System.out.println("MMS");

		int a = 10;

		int b = 5;

		try 
		{
			System.out.println("try block is started");
			int c = a / b;
			System.out.println(c);
			System.out.println("try block is Ended");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Exception is handled");
		}

		System.out.println("MME");

	}

}
