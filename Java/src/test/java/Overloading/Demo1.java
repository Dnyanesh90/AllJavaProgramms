package Overloading;

public class Demo1 {
	public static void m1() {
		System.out.println("m1 is static method");
	}
	public static void m1(int a, int b) {
		System.out.println("argument is +a & +b");
	}
	public static void m1(int a, String b) {
		System.out.println("m1 method with 1 int & 1 string args");
	}
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Demo1 obj =new Demo1();
		obj.m1();
		obj.m1(15, 20);
		obj.m1(15, "KADAM");
		
	}

}
