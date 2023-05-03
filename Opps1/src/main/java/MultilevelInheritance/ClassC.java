package MultilevelInheritance;

public class ClassC extends ClassB{

	public void c1()
	{
		System.out.println("C1 Method in ClassC");
	}

	public void c2()
	{
		System.out.println("C2 Method in ClassC");
	}
	
	public void c3()
	{
		System.out.println("C3 Method in ClassC");
	}
	
	public static void main(String[] args) {

		ClassB obj =new ClassC();
		obj.a1();
		obj.a2();
		obj.a3();
		obj.b1();
		obj.b2();
		obj.b3();
		
		
		
		
		
		
		
		ClassA obj1 =new ClassC();
		obj1.a1();
		obj1.a2();
		obj1.a3();
	
		
	
		ClassA obj2 =new ClassA();
		obj2.a1();
		obj2.a2();
		obj2.a3();
		
			
		
		ClassB obj3 =new ClassB();
		obj3.a1();
		obj3.a2();
		obj3.a3();
		obj3.b1();
		obj3.b2();
		obj3.b3();
		
		
		
		ClassC obj4 =new ClassC();
		obj4.a1();
		obj4.a2();
		obj4.a3();
		obj4.b1();
		obj4.b2();
		obj4.b3();
		obj4.c1();
		obj4.c2();
		obj4.c3();
		
		
	}
}

	


