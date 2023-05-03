package Tutorial6;

public class Demo1 {

	public Demo1() 
	{
		System.out.println("0 args cons...");
	}

	public void m1() {
		System.out.println("M1 method");
	}

	public static void main(String[] args) {

		Demo1 obj = new Demo1();

		obj.m1();

	}

}
