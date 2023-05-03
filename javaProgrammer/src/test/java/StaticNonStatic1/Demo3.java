package StaticNonStatic1;

public class Demo3 {
	public static void abc(String xyz)
	{
		for (int i=xyz.length()-1;i>=0;i--)
		{
			System.out.print(xyz.charAt(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println("Main method is started");
		
		Demo3.abc("Selenium");
		
		Demo3.abc("Cucumber testing");
		
		System.out.println("Main method is Ended");
		

	}

}
