package StaticNonStatic1;

public class Demo1 {

	public static void abc(String a)
	{
		System.out.println(a);
	}
	
	
	

	public static void main(String[] args) {

		System.out.println("Pune");
		
		Demo1.abc("selenium");
		
		System.out.println("Mumbai");

	}

}
