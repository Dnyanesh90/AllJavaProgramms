package Inheritance;

public class Sample5 extends Demo5 {
	public void s1()
	{
		System.out.println("S1 method in Sample3  class");
	}

	public void s2()
	{
		System.out.println("S2 method in Sample 3 class");
	}
	
	public void d1()
	{
		System.out.println("D1 method in sample3 class");
	}

	
	
	
	public static void main(String[] args) {
		
		Demo5 obj =new Demo5();
		
		obj.d1();
		obj.d2();
		
		
		
		
	}

}
