package Tutorial1;

public class Sample2 extends Demo2 {
	public void s1() {
		System.out.println("S1 non static method in Sample2 class");
	}
	
	public static void s2() {
		System.out.println("S2 static method in Sample2 class");
	}
	
	public void d1() {
		System.out.println("D1 Sample2 class ");
	}
	
	

	public static void main(String[] args) {
		
		Sample2.s2();
		Sample2.d3();
		
		Sample2 obj =new Sample2();
		//if parent class and child class contains same method with same arguumnet
		// then priority goes to child class or local class
		

		obj.d1();
		obj.d2();
		obj.s1();

	}

}
