package Inheritance;

public class Sample7 extends Demo7 {
	public void s1() 
	{
		System.out.println("S1  method in Sample4 class");
	}

	public void s2() 
	{
		System.out.println("S2  method in Sample4 class");
	}

	public static void main(String[] args) 
	{
		//Reference of parent class and object of child class
		//this allow to access all methods only from parent class
		Demo7 obj =new Sample7();
		obj.d1();
		obj.d2();
		
		
	}

}
