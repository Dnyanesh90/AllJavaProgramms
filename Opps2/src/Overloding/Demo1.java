package Overloding;

public class Demo1 {
	public void abc() {
		System.out.println("abc 0 args method");
	}

	public void abc(int a) {
		System.out.println("abc  1 int arg " + a);
	}

	public void abc(String b) {
		System.out.println("Abc 1 String arguments ");
	}

	public void abc(String a, int b) {
		System.out.println("abc 1 string and 1 int argument"+(a+b));
	}

	public void abc(int a, String b) {
		System.out.println("abc 1 int and 1 String argument "+(a+b));
	}

	public static void main(String[] args) {
		
		Demo1 obj =new Demo1();
		obj.abc("selenium");
		obj.abc();
		obj.abc("testng", 100);
		obj.abc(100,"cucumber");
		obj.abc(100);
}
}