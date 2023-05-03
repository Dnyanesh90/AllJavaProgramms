package StaticNonStatic;

public class Demo7 {
	public static void m1()
	{
		System.out.println("M1 is demo7 class");
	}
	public static void m2()
	{
		System.out.println("M2 is demo7 class");
	}
	public static void m3()
	{
		System.out.println("M3 is demo7 class");
	}
	public static void m4()
	{
		System.out.println("M4 is demo7 class");
	}
	

	public static void main(String[] args) {
		System.out.println("Main method is started");
		m1();
		System.out.println("N2 is class");
		Demo7.m2();
		System.out.println("N3 is class");
		Demo7 obj =new Demo7();
		obj.m3();
		System.out.println("N4 is class");
		m4();
		System.out.println("Main method is ended");
		
		
		
		

	}

}
