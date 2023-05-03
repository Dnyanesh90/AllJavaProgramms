package Tutorial4;

public class Pune1 extends Demo1{
	public void p1() {
		System.out.println("P1 method in Pune1 class");
	}
	
	public void p2() {
		System.out.println("P2 method in Pune1 class");
	}
	
	
	public static void main(String[] args) {
		Demo1 obj =new Demo1();
		obj.d1();
		obj.d2();
		
  	Sample1 obj1  =new Sample1();
		obj1.d1();
		obj1.d2();
		obj1.s1();
		obj1.s2();
		obj1.s3();
		
		Pune1 obj11 =new Pune1();
		obj11.d1();
		obj11.d2();
		obj11.p1();
		obj11.p2();
		
		
		
		
	}
	
}
