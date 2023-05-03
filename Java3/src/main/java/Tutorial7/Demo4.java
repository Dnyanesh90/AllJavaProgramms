package Tutorial7;

public class Demo4 {

	public void m1(){
		System.out.println("M1 method in Demo4 classes");//2
	}
	
	public void m2(){
		System.out.println("M2 method in Demo4 classes");//3
	}
	

	public static void main(String[] args) {
		System.out.println("main method is started");//1
		
		Demo4 obj =new Demo4();
		
		obj.m1();
		obj.m2();
	
		System.out.println("main method is ended");//4
		
	}

}
