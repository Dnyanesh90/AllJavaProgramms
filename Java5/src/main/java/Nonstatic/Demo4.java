package Nonstatic;

public class Demo4 {
	public void m1()
	{
		System.out.println("M1 is Demo4 class");
	}
	public void m2()
	{
		System.out.println("M2 is Demo4 class");
	}

	public static void main(String[] args) {
		System.out.println("Main method is started");
		Demo4 obj =new Demo4();
		obj.m1();
		obj.m2();
		System.out.println("Main method is ended");
		

	}

}
