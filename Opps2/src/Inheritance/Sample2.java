package Inheritance;

public class Sample2 extends Demo2 {
	
	public static void s1()
	{
		System.out.println("s1 static method in Sample2 class");
	}
	public static void s2()
	{
		System.out.println("s2 static method in Sample2 class");
	}


	public static void main(String[] args) {
		Sample2.d1();
		Sample2.d2();
		Sample2.d3();
//		
		Sample2.s1();
		Sample2.s2();
//		
		Demo2.d1();
		Demo2.d2();
		Demo2.d3();

		d1();
		d2();
		d3();
		s1();
		s2();
		
		Sample2 obj =new Sample2();
//		obj.d1();
//		obj.d2();
//		obj.d3();
//		obj.s1();
//		obj.s2();

//		Demo2 obj = new Demo2();
//		obj.d1();
//		obj.d2();
//		obj.d3();

//		Demo2 obj =new Sample2();
//		obj.d1();
//		obj.d2();
//		obj.d3();
		
	//	Sample2 obj =new Demo2();
				
		

	}

}
