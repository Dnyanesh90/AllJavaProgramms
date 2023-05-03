package StaticNonStatic1;

public class Demo8 {
	public static int abc()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("abc method");
		return a+b;
		
	}

	public static void main(String[] args) {
		System.out.println("main Method is Started");
		int xyz=Demo8.abc();
		System.out.println(xyz);
		System.out.println("main Method is Ended");
		

	}

}
