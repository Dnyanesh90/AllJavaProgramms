package Tutorial;

public class Demo2 {
	public static void m1()
	{
		System.out.println("m1 is demo2 class");
	}
	public static void m2()
	{
		System.out.println("m2 is demo2 class");
	}
	public static void m3()
	{
		System.out.println("m3 is demo2 class");
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		Demo2 obj =new Demo2();
		obj.m1();
		Demo2.m2();
		m3();
		System.out.println("MME");
	

	}

}
