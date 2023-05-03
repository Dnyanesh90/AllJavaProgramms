package Tutorial1;

public class Sample1 extends Demo1 {
    int a=777;
	
	public void xyz()
	{
		int a=555;
		
		System.out.println(a);//555
		
		System.out.println(this.a);//777
		
		System.out.println(super.a);//100
	}

	public static void main(String[] args) {
		Sample1 obj =new Sample1();
		obj.xyz();
		
		

	}

}
