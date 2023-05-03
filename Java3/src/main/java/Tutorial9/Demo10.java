package Tutorial9;

public class Demo10 {
	public static void m1() {
		System.out.println("M1 method");//2
	}
	
	public static void m2() {
		m1();
		System.out.println("M2 method");//3
	}
	
	
	public static void main(String[] args) {
		System.out.println("mms");//1
		m2();
		System.out.println("mme");//4
}
}