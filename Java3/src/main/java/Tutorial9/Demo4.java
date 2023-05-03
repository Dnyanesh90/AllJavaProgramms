package Tutorial9;

public class Demo4 {
	public static void abc() {
		System.out.println("Abc method");
	}

	//@SuppressWarnings("static-access")
	public static void main(String[] args) {

		System.out.println("Main method is started");

		Demo4 obj =new Demo4();
		obj.abc();
		
		System.out.println("main method is ended");

	}

}
