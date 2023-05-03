package Tutorial1;

public class Demo2 {
	
	int a = 999;

	public void abc() 
	{
		//within the block of code.
		int a = 222;
		System.out.println(a);// 222			
		System.out.println("abc method in  Demo2 class");//
	}

	public void xyz() {

		this.abc();
		
		System.out.println(a);// 999			3

		System.out.println("xyz method in  Demo2 class");		//4
	}

	public static void main(String[] args) {
		
		Demo2 obj =new Demo2();
		obj.xyz();
		
		

	}

}
