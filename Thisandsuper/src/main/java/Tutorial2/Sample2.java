package Tutorial2;

public class Sample2 extends Demo2 {
	public Sample2()
	{
		super(100);
		System.out.println("0 args cons in Sample 5 class");
	}
	
	public Sample2(int a)
	{
		this();
		System.out.println("1 int args cons in Sample 5 class");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Sample2 obj =new Sample2(100);
		
	}

}
