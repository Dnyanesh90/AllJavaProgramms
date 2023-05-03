package StaticNonStatic;

public class Demo5 {
	public static void abc()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("pune");
		Demo5.abc();
		System.out.println("Mumbai");
		
		

	}

}
