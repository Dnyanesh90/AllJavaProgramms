package SinglelevelInheritance;

public class Demo1 {
	public void abc()
	{
		System.out.println("ABC method in Demo1 class");
	}

	public void pqr()
	{
		System.out.println("PQR method in Demo1 class");
	}
	
	public void xyz()
	{
		System.out.println("XYZ method in Demo1 class");
	}
	
	public static void main(String[] args) {
		
		Sample1 obj =new Sample1();
		obj.abc();
		obj.xyz();
		obj.pqr();
		obj.p1();
		obj.p2();
		obj.p3();
		
	}

}
