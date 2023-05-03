package Nonstatic;

public class Demo2 {
	public void xyz()
	{
		System.out.println("xyz method inside in Demo2 java");
	}

	
	public static void main(String[] args) {
		System.out.println("Main method is started");
		Demo2 obj =new Demo2();
		obj.xyz();
		System.out.println("Main method is ended");
		
		

	}

}
