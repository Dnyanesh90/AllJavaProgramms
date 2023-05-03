package Overloding;

public class Demo5 {
	public int abc() {
		System.out.println("abc method with 0 args in  Demo4 class");
		return 10;
	}
	
	public int abc(int a) {
		System.out.println("abc method with 1 args in  Demo4 class");
		return a;
	}
	
	public static void main(String[] args) {
		
		Demo5 obj =new Demo5();
		System.out.println(obj.abc());
		System.out.println(obj.abc(100));
		
}
}