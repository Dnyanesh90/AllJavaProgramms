package StaticNonStatic;

public class Demo1 {
	public static void abc()
	{
		System.out.println("abc method is Started");
	}
	

	public static void main(String[] args) 
	{
		abc();
		Demo1.abc();
		Demo1 obj=new Demo1();
		obj.abc();
		

	}

}
