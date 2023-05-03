package MultilevelInheritance;

public class ClassB extends ClassA{

	public void b1()
	{
		System.out.println("B1 Method in ClassB");
	}

	public void b2()
	{
		System.out.println("B2 Method in ClassB");
	}
	
	public void b3()
	{
		System.out.println("B3 Method in ClassB");
	}
	
	
	public static void main(String[] args) {

		ClassA obj =new ClassC();
		obj.a1();
		obj.a2();
		obj.a3();

	}

}
