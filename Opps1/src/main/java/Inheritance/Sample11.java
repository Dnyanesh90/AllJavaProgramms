package Inheritance;

public class Sample11 extends Demo11 {

	public void s1()
	{
		System.out.println("S1 method in Sample8 class");
	}
	
	
	
	public static void main(String[] args) {
			//both class
		Sample11 obj =new Sample11();
		obj.d1();
		obj.d2();
		obj.s1();
		
		//only parent class
		Demo11 obj1 =new Demo11();
		obj1.d1();
		obj1.d2();
		
		//only parent class
		Demo11 obj2 =new Sample11();
		obj2.d1();
		obj2.d2();
		//if same non static method present inside the parent and child class
		//priority goes go object creation class
		
		//if same  static method present inside the parent and child class
		//priority goes go object reference class
		

	}

}
