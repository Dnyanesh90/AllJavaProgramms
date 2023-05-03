package Tutorial2;

public class D extends C{
	public void d1() {
		System.out.println("D1 method in D Class");
	}
	
	public void d2() {
		System.out.println("D2 method in D Class");
	}
	
	
	
	public static void main(String[] args) {
		D obj =new D();
		obj.a1();
		obj.a2();
		obj.a3();
		obj.b1();
		obj.b2();
		obj.c1();
		obj.c2();
		obj.d1();
		obj.d2();
		
		
	}
}
