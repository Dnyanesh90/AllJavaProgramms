

package Tutorial1;

public class Demo2 {
	public static void m1() {
		Demo2 obj = new Demo2();
		System.out.println("M1 static method in Demo2 class ");//1
		obj.m3();
	}

	public void m2() {
		System.out.println("M2 non static method in Demo2 class");//2
	}

	public void m3() {
		m2();
		System.out.println("M3 non static method in Demo2 class");//3
	}

	public static void main(String[] args) {
		
		Demo2.m1();
		

	}

}
