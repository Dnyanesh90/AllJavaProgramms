package StaticNonStatic;

public class Demo3 {
	public static void abc()
	{
		System.out.println("xyz method in java");
	}
	public static void pqr()
	{
		System.out.println("pqr method in java");
	}

	public static void main(String[] args) {
		System.out.println("Main method is started");
		abc();
		pqr();
		System.out.println("Main method is ended");
		

	}

}
