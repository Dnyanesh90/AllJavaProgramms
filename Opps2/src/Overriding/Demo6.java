package Overriding;

public class Demo6 {
	public void login() {
		System.out.println("Login method in Demo6 class");
	}
	

	public void login(String a) {
		System.out.println("Login method in Demo6 class with 1 string arg");
	}
	
	
	public void login(String a,String b) {
		System.out.println("Login method in Demo6 class with 2 string arg");
	}
}
