package Inheritance;

public class Sample9 extends Demo9{
	public void d1()
	{
		System.out.println("D1 non static method in Sample7 class");
	}
	
	public void s1()
	{
		System.out.println("S1 non static method in Sample7 class");
	}
	

	public static void main(String[] args) 
	{
		//Ref of child class and object of child class
		//this allow to access all the methods from parent and child class
		//but if same non static method present inside the parent amnd child class
		//prority goes to the child class/local class
		Sample9 obj =new Sample9();
		obj.d1();//Sample7
		obj.d2();//Demo7
		obj.d3();//Demo7
		obj.s1();//Sample7
		
		Demo9 obj1 =new Sample9();
		obj1.d1();//
		obj1.d2();//Demo7
		obj1.d3();//Demo7
		
		//obj.s1();//Sample7
		
	}
	}


