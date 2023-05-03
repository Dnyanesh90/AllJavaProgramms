package Tutorial9;

public class Demo2 {

	public void abc() {
		System.out.println("Abc is called");
	}

	public void pqr() {
		xyz();
		System.out.println("PQR is called");
	}

	public void xyz() {
		System.out.println("xyz is called");
		abc();
	}

	public static void main(String[] args) {
		System.out.println("Pune");//1
		Demo2 obj = new Demo2();
		obj.pqr();
		System.out.println("Mumbai");
	}

}
