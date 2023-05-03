package Tutorial13;

public class Demo4 {
	public void abc() {
		System.out.println("abc method ");
	}

	public void xyz() {
		System.out.println("abc method");
	}

	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {

		new Demo4();

		new Demo4();

		System.gc();

	}
}
