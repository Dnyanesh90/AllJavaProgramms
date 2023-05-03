package Inheritance;

public class Sample4 extends Demo4 {

	public void d1()
	{
		System.out.println("D1 method in Sample3  class");
	}

	public void s1()
	{
		System.out.println("D2 method in Sample 3 class");
	}

	
	
	
	public static void main(String[] args) {
		
		Sample4 obj =new Sample4();
		//if we same method present inside the child class and
		//parent class then priority goes to local class
		///only for non static methods
		obj.d1();//Sample 3 class
		obj.d2();//Demo3 class
		obj.s1();//Sample3 class
		
		
		
		
	}

}
