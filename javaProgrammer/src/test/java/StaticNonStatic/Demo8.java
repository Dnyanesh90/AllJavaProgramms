package StaticNonStatic;

public class Demo8 {
	public static void m1()
	{
		System.out.println("Mumbai is big city");
	}
	public static void m2()
	{
		System.out.println("Pune is big city");
	}
	public static void m3()
	{
		System.out.println("Delhi is big city");
	}
	public static void m4()
	{
		System.out.println("Banglore is big city");
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		Demo8.m1();
		Demo8 obj=new Demo8();
		obj.m2();
		obj.m3();
		obj.m4();
		System.out.println("MME");
	
		}
	}


