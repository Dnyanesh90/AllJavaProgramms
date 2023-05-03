package Overloading;

public class Demo5 {
	public Demo5()
	{
		System.out.println("Demo5 with o args");
	}
	
	public Demo5(int a)
	{
		System.out.println("Demo5 with 1 args");
	}
	
	public Demo5(int b,int a)
	{
		System.out.println("Demo5 with 2 int args");
	}
	
	
	public static void main(String[] args) {
		
		Demo5 obj =new Demo5(10,2000);

	}

}
