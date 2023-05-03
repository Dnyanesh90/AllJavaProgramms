package XYZ;

public class Demo8 {

	public static void main(String[] args) {
		int a[] = new int[5];

		a[1] = 10;
		a[3] = 20;
		a[0] = 200;
		a[4] = 900;

		try 
		{
			System.out.println("try block is started");
			a[15] = 145;
			System.out.println(a);
			System.out.println("try block is ended");
		} 
		catch (NullPointerException e) 
		{
			System.out.println("Null pointer catch block ");
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array index catch block");
		} 
		catch (Exception e) 
		{
			System.out.println("parent catch block of code");
		} 
		finally 
		{
			System.out.println("Finally block of code");
		}


	}

}
