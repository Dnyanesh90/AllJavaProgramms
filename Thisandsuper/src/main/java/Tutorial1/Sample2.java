package Tutorial1;

public class Sample2 extends Demo2 {
	
int a=333;
	
	public void abc()
	{
		int a=200;
		System.out.println(a);//200
		System.out.println(this.a);//333
	}
	
	public void xyz()
	{
		System.out.println(super.a);//999
		System.out.println(this.a);//333
		this.abc();
		super.abc();
		System.out.println("xyz method in Sample2 class");
		
	}

	public static void main(String[] args) {
		
		Sample2 obj =new Sample2();
		obj.xyz();
		
		
	}

}
