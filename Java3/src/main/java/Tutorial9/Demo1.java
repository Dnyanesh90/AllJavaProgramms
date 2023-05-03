package Tutorial9;

public class Demo1 {

	public void m1() {
		System.out.println("M1 method");//2
	}
	
	public void m2() {
		m1();
		System.out.println("M2 method");//3
	}
	
	public static void main(String[] args) {
		System.out.println("Main method is started");//1
		Demo1 obj =new Demo1();
		
		obj.m2();
		System.out.println("Main method is ended");//4
		
	}

}
