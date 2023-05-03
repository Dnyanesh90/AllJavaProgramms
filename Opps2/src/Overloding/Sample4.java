package Overloding;

public class Sample4 extends Demo4 {

	public void abc(int a, int b) {
		System.out.println("abc method with 2 args in  Demo4 class");
	}
	
	
	
	public static void main(String[] args) {
		Sample4 obj =new Sample4();
		obj.abc();
		obj.abc(100);
		obj.abc(10, 10);

	}

}
