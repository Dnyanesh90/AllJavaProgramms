package Tutorial9;

public class child extends parent{
	public void c1() {
		System.out.println("c1 method");
	}
	
	public void c2() {
		System.out.println("c2 method");
	}
	
	
	
	public static void main(String[] args) {
		
		parent obj =new child();
		
		//child reference and object of parent class.
		
		child obj2 =(child)obj;
		
		obj2.c1();
		obj2.p1();
		obj2.p2();
		obj2.p3();
		obj2.c2();
		
		
	}
}
