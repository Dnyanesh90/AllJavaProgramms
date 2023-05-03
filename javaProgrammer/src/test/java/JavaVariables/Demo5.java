package JavaVariables;

public class Demo5 {
	private String a = "Private Variable";

	String b = "Default Variable";
	
	protected String c ="Protected Variable";
	
	public String d="Public variable";

	private void m1() {
		System.out.println("Private Method");
	}

	void m2() {
		System.out.println("Default Method");
	}

	protected void m3()
	{
		System.out.println("Protected Method");
	}
	
	public void m4()
	{
		System.out.println("Public Method");
	}
	
	public static void main(String[] args) 
	{
		Demo5 obj =new Demo5();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}


}
