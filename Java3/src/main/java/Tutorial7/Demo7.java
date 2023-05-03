package Tutorial7;

public class Demo7 {
	public void abc(int a, int b)
	{
		System.out.println(a+b);//2
	}
	

	public static void main(String[] args) {
		System.out.println("Main method is started");//1
		Demo7 obj =new Demo7();
		obj.abc(100, 200);
		System.out.println("Main method is ended");//3
		
	}

}
