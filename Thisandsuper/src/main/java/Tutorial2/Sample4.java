package Tutorial2;

public class Sample4 extends Demo4 {
	
	public Sample4() 
	{	
		//super(10);
		System.out.println("0 args cons in Sample 7 class");
	}

	public Sample4(String a) 
	{
		//super("selenium");
		System.out.println("1 int args cons in Sample 7 class");
	}

	public Sample4(int a) 
	{
		//super(10,10);
		System.out.println("1 int args cons in Sample 7 class");
	}
	
	public Sample4(String a, int b)
	{
		
		System.out.println("1 int and 1 String cons");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Sample4 obj = new Sample4("selenium");

		
	}

}
