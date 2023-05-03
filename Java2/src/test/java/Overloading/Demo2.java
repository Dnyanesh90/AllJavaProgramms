package Overloading;

public class Demo2 {
	public static void abc() {
		System.out.println("abc method with 0 args");
	}
	public static void abc(int m) {
		System.out.println("abc method in 1 args");
	}
	public static void abc(String m) {
		System.out.println("abc method in String args " +m);
	}
	public static void abc(int m, String s) {
		System.out.println("abc method in 1 args & 1 String args " +s);
	}

	public static void main(String[] args) {
		Demo2 obj =new Demo2();
		obj.abc();
		obj.abc(30);
		obj.abc("KADAM");
		obj.abc(30, "KADAM");
		

	}

}
