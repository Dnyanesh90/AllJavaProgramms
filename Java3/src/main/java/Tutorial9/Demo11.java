package Tutorial9;

public class Demo11 {
	public void abc() {
		System.out.println("Abc methood in Demo11 class");
	}
	
	
	public void xyz() {
		abc();
		System.out.println("XYZ methood in Demo11 class");
	}
	
	

	public static void main(String[] args) {
		//how to call non static  method inside the main method or static
		System.out.println("MMS");
		Demo11 obj =new Demo11();
		obj.xyz();
		
		System.out.println("MME");

	}

}
