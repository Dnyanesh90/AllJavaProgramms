package Tutorial7;

public class Demo6 {

	public void display() {
		System.out.println("Display Method");//3  5
	}

	public static void main(String[] args) {
		System.out.println("Pune");//1
		Demo6 obj = new Demo6();
		System.out.println("Mumbai");//2
		obj.display();
		System.out.println("Delhi");//4
		obj.display();
		System.out.println("Dubai");//6
	}
	}


