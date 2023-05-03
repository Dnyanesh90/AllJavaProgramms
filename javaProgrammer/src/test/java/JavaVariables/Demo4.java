package JavaVariables;

public class Demo4 {

	static String b="TestNG";
	
	String a="selenium";
	
	public void m1()
	{
		String c="cucumber";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void m2()
	{
		Demo4 obj =new Demo4();
		System.out.println(obj.a);
		System.out.println(b);
	
	}

	public static void main(String[] args) 
	{	
		System.out.println(b);
		Demo4 obj =new Demo4();	
	
		System.out.println(obj.a);
	}
	

}
