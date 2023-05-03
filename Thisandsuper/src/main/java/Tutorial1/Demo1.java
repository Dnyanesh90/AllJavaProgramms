package Tutorial1;

public class Demo1 {
	
    int a=100;
	
	public void abc()
	{
		int a=900;
		System.out.println(a);//900
		System.out.println(this.a);//100
		
	}

	public static void main(String[] args) {
		
        Demo1 obj =new Demo1();
		
		obj.abc();
		
	}

}
