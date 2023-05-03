package Overloading;

public class Demo3 {
	public static void m1() 
	{
		System.out.println("m1 method with 0 args");
	}
	public static void m1(int a) 
	{
		System.out.println("m1 method with 1 int args is ");
	}
	public static void m1(int a, int b) 
	{
		System.out.println("m1 method with 2 int args is " +a  +b);
	}
	public static void m1(int a, int b, int c)
	{
		System.out.println("m1 method with 3 args is "+a +b +c );
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Demo3 obj =new Demo3();
		obj.m1();
		obj.m1(10);
		obj.m1(10, 10);
		obj.m1(10, 10, 10);
		
	}

}
