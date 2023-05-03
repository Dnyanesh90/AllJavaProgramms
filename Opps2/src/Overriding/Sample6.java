package Overriding;

public class Sample6 extends Demo6{
	public void login() {
		System.out.println("login method in Sample6 class");
	}
	
	public void login(String a) {
		System.out.println("login method in Sample6 class with 1 string arg");
	}
	
	
	public void login(String a,String b) {
		System.out.println("login method in Sample6 class with 2 string arg");
	}
	
	
	public void login(int a) {
		System.out.println("login method in Sample6 class "+a);
	}
	
	public static void main(String[] args) {
		Sample6 obj =new Sample6();
		obj.login();
		obj.login("Admin");
		obj.login("Admin", "admin123");
		obj.login(100);
		
		Demo6 obj1 =new Demo6();
		obj1.login();
		obj1.login("Admin");
		obj1.login("Admin", "admin123");
		
		
	}
}
