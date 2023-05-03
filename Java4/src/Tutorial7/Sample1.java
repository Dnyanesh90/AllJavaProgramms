package Tutorial7;

public class Sample1 extends Demo1 {
	public void d1() {
		System.out.println("D1 method in Sample1 class");
	}
	
	public static void main(String[] args) {
		Demo1 obj =new Sample1();
		
		obj.d1();
		obj.d2();
		obj.d3();
		
	}
}
