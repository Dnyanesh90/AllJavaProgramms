package HierachicalInheritance;

public class ClassR extends ClassP{

	
	public void r1()
	{
		System.out.println("R1 method in classR");
	}
	
	public void r2()
	{
		System.out.println("R2 method in classR");
	}
	
	public void r3()
	{
		System.out.println("R3 method in classR");
	}
	
	public static void main(String[] args) 
	{
		ClassQ obj =new ClassQ();
		obj.p1();
		obj.p2();
		obj.p3();
		obj.q1();
		obj.q2();
		obj.q3();
		
		
		
		
		
		
		
		
		
		
//		ClassP obj =new ClassR();
//		obj.p1();
//		obj.p2();
//		obj.p3();
		
		
//		ClassR obj =new ClassR();
//		obj.p1();
//		obj.p2();
//		obj.p3();
//		obj.r1();
//		obj.r2();
//		obj.r3();
	}

}
