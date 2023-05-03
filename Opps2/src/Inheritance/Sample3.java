package Inheritance;

public class Sample3 extends Demo3 {
	

	public static void pune()
	{
		System.out.println("Pune static method in  Sample 3 class");
	}
	
	
	public  void mumbai()
	{
		System.out.println("Mumbai method in  Sample 3 class");
	}
	
	public void pimPage()
	{
		System.out.println("PIM Page method in Sample3 class");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Sample3 obj =new Sample3();
		obj.mumbai();
		Sample3.pune();
		Sample3.login("Admin", "admin");
	    obj.pimPage();
		obj.display();
		
		Demo3 obj1 =new Demo3();
		obj1.login("acb", "abc");
		obj1.display();
		obj1.pimPage();
	}
		

	}

