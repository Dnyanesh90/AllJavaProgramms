package StaticNonStatic;

public class Demo9 {
	public static void abc()
	{
		System.out.println("ABC Method in java");
	}
	public static void pqr()
	{
		System.out.println("PQR Method in java");
	}
	public static void jkl()
	{
		System.out.println("JKL Method in java");
	}
	public static void xyz()
	{
		System.out.println("XYZ Method in java");
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		Demo9 obj= new Demo9();
		obj.abc();
		pqr();
		jkl();
		obj.xyz();
		System.out.println("MME");
		

	}

}
