package Nonstatic;

public class Demo9 {
	public void abc(String a,String b) {
		System.out.println(a.equals(b));
	}

	public static void main(String[] args) {
		Demo9 obj =new Demo9();
		obj.abc("Selenium", "selenium");
		obj.abc("selenium", "Selenium");
		obj.abc("selenium", "selenium");
		obj.abc("Selenium", "Selenium");
		
	}

}
