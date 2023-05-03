package Nonstatic;

public class Demo6 {
	public void kadam() {
		System.out.println("Kadam method");
	}

	public static void main(String[] args) {
		System.out.println("pune");
		Demo6 obj =new Demo6();
		System.out.println("Mumbai");
		obj.kadam();
		System.out.println("Delhi");
		obj.kadam();
		System.out.println("Chennai");
		
	}

}
