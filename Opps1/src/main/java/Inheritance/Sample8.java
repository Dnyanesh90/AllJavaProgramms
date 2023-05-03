package Inheritance;

public class Sample8 extends Demo8 {

	public static void d1() {
		System.out.println("D1 static method in Sample5 class");
	}

	public void d2() {
		System.out.println("D2  method in Sample5 class");
	}
	
	
	public static void main(String[] args) 
	{
		Demo8 obj =new Sample8();
		obj.d1();//Demo5 class
		
		obj.d2();//sample 5 class
		
	}

	}


