package Overloding;

public class Demo3 {
	public static void abc() {
		System.out.println("Abc method 0 args");
	}
	
	public static void abc(int a) {
		System.out.println("Abc method a int args "+a);
	}
	
	public static void abc(String a) {
		System.out.println("Abc method 1 string args "+a);
	}
	
	public static void abc(int a , int b) {
		System.out.println("Abc method 2 int args "+(a+b));
	}
	

	public static void main(String[] args) {
		Demo3.abc();
		Demo3.abc(100);
		Demo3.abc("cucumber");
		Demo3.abc(10, 2000);
		
	}
}
