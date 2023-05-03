package StaticNonStatic1;

public class Demo4 {
	public static void abc(int a,int b)
	{
		if(a>b)
		{
			System.out.println("a is big number");
		}
		else
		{
			System.out.println("b is big number");
		}
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		{
			int a=200;
			int b=100;
			
			Demo4.abc(a, b);
			Demo4.abc(150, 240);
			{
				System.out.println("MME");
			}
			
		}
		

	}

}
