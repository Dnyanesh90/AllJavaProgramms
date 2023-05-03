package Tutorial2;

public class C extends B{
	public void c1() {
		System.out.println("C1 method in C Class");
	}
	
	public void c2() {
		System.out.println("C2 method in C Class");
	}
	
	public static void main(String[] args) {
		
		C obj =new C();
		obj.a1();
		obj.a2();
		obj.a3();
		obj.b1();
		obj.b2();
		obj.c1();
		obj.c2();
		
}
}