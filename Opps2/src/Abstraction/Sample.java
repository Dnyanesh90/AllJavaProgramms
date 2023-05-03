package Abstraction;

public class Sample extends Demo1 {
	@Override
	public void m3() {
		System.out.println("M3 method in Sample 3 class");
	}

	public void m4() {
		System.out.println("M4 method in Sample 4 class");
	}
	
	public static void main(String[] args) {
		// reference of parent class and object of parent class: invalid in abstract class
			//Demo obj1=new Demo();
		// reference of child class and object of child class: valid Scenario.
								//(we can access all parent and child class)
			Sample obj2 =new Sample();
			obj2.m1();
			obj2.m2();
			obj2.m3();
			obj2.m4();
		//reference of parent class and object of child class:valid Scenario.
								//(we can access parent class methods)
			Demo1 obj3 =new Sample();
			obj3.m1();
			obj3.m2();
			obj3.m3();
		    obj3.m4();
		//reference of child class and object of parent class:invalid scenario.
		//Sample obj =new Demo1();
		
	
		
	}
	
}
