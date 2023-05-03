package Inheritance;

public class Sample1 extends Demo1 {
	

	public void s1()
	{
		System.out.println("S1  method in Sample1 class");
	}
	
	public void s2()
	{
		System.out.println("S2  method in Sample1 class");
	}
	
	public void m3()
	{
		System.out.println("M3 method in Sample1 class");
	}

	public static void main(String[] args) {
		//we access all the methods from parent and child
	    Sample1 obj = new Sample1();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.s1();
		obj.s2();
		
		//we access all the methods from parent
		Demo1 obj1 =new Demo1();
	    obj1.m1();
        obj1.m2();
	    obj1.m3();
		
		//reference of parent class and object of child class
		//parent class only
		
		Demo1 obj2 =new Sample1();
		obj2.m1();
		obj2.m2();
		obj2.m3();
		
	
		//reference of child class and object of parent class
		//this is invalid scenario
		
		Sample1 obj3 =(Sample1) new Demo1();
		obj3.m1();
		obj3.m2();
	    obj3.m3();
	
		
	}

}
