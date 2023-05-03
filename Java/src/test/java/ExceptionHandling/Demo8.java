package ExceptionHandling;

public class Demo8 {

	public static void main(String[] args) {
		System.out.println("MMS");//1

		int a = 10;
		int b = 0;
		try 
		{
			System.out.println("try block is started");//2
			int c = a / b;
			System.out.println(c);
			System.out.println("try block is Ended");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Exception is handled");//3
		}

		System.out.println("MME");//4
	}

}
