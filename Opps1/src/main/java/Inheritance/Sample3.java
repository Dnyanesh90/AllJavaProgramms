package Inheritance;

public class Sample3 extends Demo3 {
	public void s1()
	{
		System.out.println("S1 methods in Sample 2class");
	}
	
	public static void s2()
	{
		System.out.println("S2 static methods in Sample 2class");
	}
	
	
	public static void main(String[] args) {
		System.out.println("MMS");
//		Sample2.d1();
//		Sample2.s2();
		
		Sample3 obj =new Sample3();
		obj.d1();
		obj.abc();
		obj.xyz();
		obj.s1();
		obj.s2();
		System.out.println("MME");
		
	}

}
