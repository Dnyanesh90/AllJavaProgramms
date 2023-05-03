package HierachicalInheritance;

public class ClassQ extends ClassP {

	public void q1()
	{
		System.out.println("Q1 method in classQ");
	}
	
	
	public void q2()
	{
		System.out.println("Q2 method in classQ");
	}
	
	
	public void q3()
	{
		System.out.println("Q3 method in classQ");
	}
	
	public static void main(String[] args) {

		ClassP obj =new ClassQ();
		obj.p1();
		obj.p2();
		obj.p3();
		
		
		
		
		
//		ClassQ obj =new ClassQ();
//		obj.p1();
//		obj.p2();
//		obj.p3();
//		obj.q1();
//		obj.q2();
//		obj.q3();
		
		
		
		
//		ClassR obj =new ClassR();
//		obj.p1();
//		obj.p2();
//		obj.p3();
//		obj.r1();
//		obj.r2();
//		obj.r3();
	}

}
