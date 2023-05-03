package Overriding;

public class Sample1 extends Demo1 {
	public void abc() {
		
		System.out.println("abc method in Sample1 class");
	}
	

	public static void main(String[] args) {
		Sample1 obj =new Sample1();
		obj.abc();
		Demo1 obj1 =new Demo1();
	}
}
