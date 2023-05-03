package MultilevelInheritance;

public class ClassA {
	public void a1()
	{
		System.out.println("A1 Method in ClassA");
	}

	public void a2()
	{
		System.out.println("A2 Method in ClassA");
	}
	
	public void a3()
	{
		System.out.println("A3 Method in ClassA");
	}

	public static void main(String[] args) {
		
		ClassA obj =new ClassC();
		obj.a1();
		obj.a2();
		obj.a3();

}
}
