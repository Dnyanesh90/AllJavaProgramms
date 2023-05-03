package Inheritance;

public class Sample6 extends Demo6 {

	public static void s1() 
	{
		System.out.println("S1 static method in Sample4 class");
	}

	public void s2() 
	{
		System.out.println("S2 non static method in Sample4 class");
	}

	public static void main(String[] args) 
	{
		Demo6.d1();
		Demo6 obj=new Demo6();
		obj.d2();
		
		
	}
}
