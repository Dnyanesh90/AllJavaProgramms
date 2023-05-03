package Abstraction;

public class Sample2 extends Demo2{
	public void pqr() {
		System.out.println("Pqr method in Sample2 class");
	}

	public void xyz() {
		System.out.println("xyz method in Sample2 class");
	}

	public static void main(String[] args) {
		Demo2 obj = new Sample2();
		obj.abc();
		obj.pqr();
		obj.xyz();
	}
}
