package HierachicalInheritance;

public class ClassP {

	public void p1()
	{
		System.out.println("P1 method in class P");
	}

	public void p2()
	{
		System.out.println("P2 method in class P");
	}

	
	public void p3()
	{
		System.out.println("P3 method in class P");
	}

	
	public static void main(String[] args) {
		
		ClassQ obj =new ClassQ();
		obj.p1();
		obj.p2();
		obj.p3();
		obj.q1();
		obj.q2();
		obj.q3();
	}

}
