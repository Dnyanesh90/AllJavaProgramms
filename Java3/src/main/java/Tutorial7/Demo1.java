package Tutorial7;

public class Demo1 {

	public void abc()
	{
		System.out.println("Abc method inside the Demo1 class");//2
	}
	

	public static void main(String[] args) {
		System.out.println("Main method is started");//1
		
		Demo1 obj = new Demo1();
		obj.abc();
	
		System.out.println("Main method is ended");//3
		
	}

}
