package StaticNonStatic1;

public class Demo9 {
	//static method with STRING return type and 0 args
	public static String xyz()
	{
		String a="Selenium";
		String b="Testing";
		return a.concat(b);
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		String x=Demo9.xyz();
		System.out.println(x);
		System.out.println("MME");
		

	}

}
