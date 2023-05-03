package Tutorial6;

public class Demo2 {
	public Demo2() {
		System.out.println("O args cons");
	}

	public Demo2(int a) {
		System.out.println("1 int args cons " + a);
	}
	
	public static void m1() {
		System.out.println("M method");
	}

	
	public static void main(String[] args) 
	{
		
		@SuppressWarnings("unused")
		Demo2 obj =new Demo2();	

	}

}
