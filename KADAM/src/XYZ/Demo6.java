package XYZ;

public class Demo6 {

	public static void main(String[] args) {
        System.out.println("MMS");
		
		int a=100;
		int b=2;
		try
		{
			System.out.println("Pune");
			int c=a/b;
			System.out.println(c);
			System.out.println("Mumbai");
		}
		catch(Exception e)
		{
			System.out.println("catch block of code");
		}
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("MME");

	}

}
