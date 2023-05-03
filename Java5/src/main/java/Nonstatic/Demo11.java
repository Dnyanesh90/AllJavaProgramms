package Nonstatic;

public class Demo11 {
	public void xyz() {
		System.out.println("Xyz Method in demo11 class");
		System.out.println("Non static method without return type");
	}
	public void abc(float a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Demo11 obj =new Demo11();
		obj.abc(100.5f, 100);
		obj.xyz();
		
	
	}

}
