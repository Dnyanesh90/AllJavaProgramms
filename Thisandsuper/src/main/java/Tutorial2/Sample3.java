package Tutorial2;

public class Sample3 {
	
	public Sample3() 
	{
		this(100);
		System.out.println("0 args cons in Sample 3 class");
	}

	public Sample3(int a) 
	{
		
		System.out.println("1 int args cons in Sample 3 class");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Sample3 obj = new Sample3();
		
	}

}
