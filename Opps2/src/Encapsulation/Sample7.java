package Encapsulation;

public class Sample7 extends Demo7 {

	public static void main(String[] args) {
		
		Sample7 obj =new Sample7();
		
		String a=obj.getName();
		
		System.out.println("old name is "+a);
		
		obj.setName("cucumber");
		
		System.out.println("new Name is "+obj.getName());
	}
}
