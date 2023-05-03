package Abstraction;

public class Sample1 extends Demo1 {
	@Override
	public void m3() {
		System.out.println("M3 method in Sample 3 class");
	}

	public void m4() {
		System.out.println("M4 method in Sample 3 class");
	}
	
	public static void main(String[] args) {
		
		//reference of parent class and object of child class
		
		Demo1 obj =new Sample1();
		obj.m1();
		obj.m2();
		obj.m3();
	    obj.m4();
		
	}
	
}
