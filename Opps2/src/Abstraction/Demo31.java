package Abstraction;

public class Demo31 extends Sample3 {
	@Override
	public void d1() {
		
		System.out.println("D1 method in Pune 3 class");
	}
	
	public void p1()
	{
		System.out.println("P1 method in Pune 3 class");
	}
	
	public static void main(String[] args) {
		Sample3 obj =new Demo31();
		obj.abc();
		obj.pqr();
		obj.xyz();
		obj.d1();
		obj.s1();
		
		
		
	}
}
