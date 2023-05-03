package Encapsulation;

public class Sample8 extends Demo8 {
public static void main(String[] args) {
		
		Sample8 obj =new Sample8();
		
		System.out.println("Old Private variable Value");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getAddress());
		
		obj.setId(2);
		obj.setName("Cucumber");
		obj.setAddress("Mumbai");
		
		System.out.println("Latest Private Value");
		
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getAddress());
	}
	
}
