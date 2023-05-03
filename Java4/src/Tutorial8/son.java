package Tutorial8;

public class son extends father {
	public void bike() {
		System.out.println("son bike ");
		System.out.println("son car");
	}
	
	
	public static void main(String[] args) {
		father obj =new son();

		
		son obj2 =(son)obj;
		
		obj2.bike();
		obj2.house();
		obj2.car();
		
		
		
	}
}
