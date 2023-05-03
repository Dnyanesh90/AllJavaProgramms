package Nonstatic;

public class Demo10 {
	public void abc(String a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Demo10 obj =new Demo10();
		obj.abc("Selenium", 100);
		
		
	}

}
