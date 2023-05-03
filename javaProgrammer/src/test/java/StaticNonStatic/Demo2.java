package StaticNonStatic;

public class Demo2 {
	public static void xyz()
	{
		System.out.println("xyz method in Demo2 class");
	}

	public static void main(String[] args) {
		System.out.println("Main method is Started");
		Demo2.xyz();
		System.out.println("Main method is Ended");
		
	
	}

}
