package Tutorial2;

public class Demo1 {
	
	public Demo1()
	{
		System.out.println("0  arguments cons");//1
	}
	
	
	public Demo1(int a)
	{
		this();
		System.out.println("1 int arguments cons"+a);//2
	}
	
	
	public Demo1(String a)
	{
		this(100);
		System.out.println("1 String arguments cons"+a);//3
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Demo1 obj =new Demo1("selenium");
	

	}

}
