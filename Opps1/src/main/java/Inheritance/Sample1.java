package Inheritance;

public class Sample1 extends Demo1{
	public void s1()
	{
		System.out.println("s1 is sample1 class");
	}
	public static void m2()
	{
		System.out.println("m2 is sample1 class");
	}

	public static void main(String[] args) {
		//Sample1 obj =new Sample1();
		//obj.s1();
		//obj.m2();
		//obj.m1();
		
		Demo1 obj1 =new Sample1();
		Demo1.m1();
		Demo1.m2();
		
		
		

	}

}
