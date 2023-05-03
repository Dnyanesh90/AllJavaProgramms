package Tutorial2;

public class Sample1 {
int a=1000;
	
	public Sample1()
	{
		
		int a=999;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println("0 args cons");
	}
	
	public Sample1(int b)
	{
		this();
		System.out.println(a);
		System.out.println("1 int args cons "+a);		
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		{
			Sample1 obj =new Sample1(100);
		}
		
		
		
	}

}
