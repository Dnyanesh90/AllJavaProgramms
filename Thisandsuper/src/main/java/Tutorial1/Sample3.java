package Tutorial1;

public class Sample3 extends Demo3 {
	
String a="child class global variable";
	
	
	@SuppressWarnings("unused")
	public void m1()
	{
		
	
		String a="child class local variable";
		System.out.println("Child class m1 method");
	}
	
	public void m2()
	{
		System.out.println(this.a);//
		System.out.println(super.a);
		super.m1();
		this.m1();
		System.out.println("m2 method in Child class");
	}

	public static void main(String[] args) {
		

		Sample3 obj =new Sample3();
		obj.m2();
		

	}

}
