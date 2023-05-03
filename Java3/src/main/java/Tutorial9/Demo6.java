package Tutorial9;

public class Demo6 {
	public void m1() {
		System.out.println("M1 method");
	}

	public void m2(int a) {
		System.out.println("M2 method " + a);
	}

	public String m3() {
		return "selenium";
	}

	public boolean m4(String a, String b) {
		return a.equals(b);
	}

	public static void p1() {
		System.out.println("P1 static method");
	}

	public static void p2(String a, String b) {
		System.out.println("P2 static method " + (a + b));
	}

	public static void main(String[] args) {
		Demo6 obj = new Demo6();
		obj.m1();
		obj.m2(100);
		System.out.println(obj.m3());
		System.out.println(obj.m4("selenium", "selenium"));

		Demo6.p1();
		Demo6.p2("Selenium", "testing");
	}

}
