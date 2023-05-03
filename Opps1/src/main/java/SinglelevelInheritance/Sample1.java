package SinglelevelInheritance;

public class Sample1  extends Demo1{

	public void p1() {
		System.out.println("P1 method in Sample1 class");
	}

	public void p2() {
		System.out.println("P2 method in Sample1 class");
	}

	public void p3() {
		System.out.println("P3 method in Sample1 class");
	}

	
	public static void main(String[] args) 
	{
		Sample1 obj =new Sample1();
		obj.p1();
		obj.p2();
		obj.p3();
		
		
		Demo1 obj1 =new Demo1();
		obj1.abc();
		obj1.pqr();
		obj1.xyz();
	}

}
