package Overloading;

public class Demo4 {

	final void xyz() {
		System.out.println("xyz method in 0 args");
	}

	final void xyz(int a, int b) {
		System.out.println("xyz method in 2 args");
	}

	final void xyz(int a, int b, int c) {
		System.out.println("xyz method in 3 args");
	}

	final void xyz(int a, int b, String c) {
		System.out.println("xyz method in 3 args");
	}

	public static void main(String[] args) {

		Demo4 obj = new Demo4();
		obj.xyz(10, 200, 3000);
		obj.xyz(100, 1004, "java");
		obj.xyz();
		obj.xyz(10, 10);
	}

}
