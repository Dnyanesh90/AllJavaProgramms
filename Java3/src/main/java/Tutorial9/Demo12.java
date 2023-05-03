package Tutorial9;

public class Demo12 {
	public void p1() {
		System.out.println("P1 method in Demo12 class");//2
	}

	public static void p2() {
		Demo12 obj = new Demo12();
		obj.p1();
		System.out.println("p2 static method in demo9 class");//3
	}

	public static void main(String[] args) {
		System.out.println("MMS");//1
		Demo12.p2();
		System.out.println("MME");//4

	}
}
