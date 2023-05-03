package Inheritance;

public class Sample10 extends Demo10 {
	public static void d1() {
		System.out.println("D1  static method in Sample7 class");
	}

	public void d2() {
		System.out.println("D2 non static method in Sample7 class");
	}
	

	public static void main(String[] args) 
	{
		//ref of parent class and object of child class
		//this allow to access all the methods from parent class only.
		//but it is same non static method present inside the parent class and
		//child class this so priority goes to object creation class.
		
		//but it is same static method present inside the parent class and
		//child class this so priority goes to reference class.(parent class)
		Demo10 obj =new Sample10();
		obj.d1();//Demo10
		obj.d2();//Sample10
	}

}
