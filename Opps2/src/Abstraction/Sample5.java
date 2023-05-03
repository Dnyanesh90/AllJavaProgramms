package Abstraction;

public class Sample5 extends Demo5 {
	@Override
	public void d1(int i) {
		System.out.println("D1 method is Sample 5 "+i);
	}

	@Override
	public void d1(int i, int j) {
		System.out.println("D1 method is Sample 5 "+(i+j));
		
	}

	@Override
	public void d1(String a) {
		System.out.println("D1 method is Sample 5 "+a);
		
	}

	public static void main(String[] args) {
		Demo5 obj = new Sample5();
		obj.d1();
		obj.d1(10);
		obj.d1("selenium");
		obj.d1(10, 2000);
	}
}
