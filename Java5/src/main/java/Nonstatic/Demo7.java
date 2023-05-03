package Nonstatic;

public class Demo7 {
	public void abc(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		System.out.println( "Main method is started");
		Demo7 obj =new Demo7();
		obj.abc(100, 200);
		System.out.println("Main method is ended");
		

	}

}
