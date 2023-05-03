package StaticNonStatic;

public class Demo6 {
	public static void m1()
	{
		for(int i=10;i>=0;i--)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Latur");
		m1();
		System.out.println("Udgir");

	}

}
