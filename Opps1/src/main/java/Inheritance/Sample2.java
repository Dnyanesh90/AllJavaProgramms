package Inheritance;

public class Sample2 extends Demo2 {
	public void s1()
	{
		System.out.println("S1 methods Sample 2 class");
	}
	
	
	public void s2()
	{
		System.out.println("S2 methods Sample 2 class");
	}
	
	
	
	public static void main(String[] args) {

		//here we can access all methods from parent class as well as child class
		Sample2 obj =new Sample2();
		
		obj.d1();
		obj.d2();
		obj.s1();
		obj.s2();
		
		
	}

}
