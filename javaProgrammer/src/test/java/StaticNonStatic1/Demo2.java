package StaticNonStatic1;

public class Demo2 {
	public static void abc(String a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("cucumber");
		Demo2.abc("Selenium");
		System.out.println("Mumbai");
		abc("TestNG");
		System.out.println("Pune");

	}

}
