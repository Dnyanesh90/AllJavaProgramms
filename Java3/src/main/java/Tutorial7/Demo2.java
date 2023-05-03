package Tutorial7;

public class Demo2 {

	public void xyz(){
		System.out.println("xyz method");//3
	}
	
	public static void main(String[] args) {
		System.out.println("Main method is started");//1
		Demo2 obj = new Demo2();
		System.out.println("Object is Created of Demo2 class");//2
		obj.xyz();
		System.out.println("Main method is ended");//4

	}

}
