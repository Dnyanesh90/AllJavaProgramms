package Tutorial7;

public class Demo9 {

	// non static method without return type and 2 string parameter

		public void abc(String a, String b) {
			System.out.println(a.equals(b));
		}

		public static void main(String[] args) {

			Demo9 obj = new Demo9();
			obj.abc("selenium", "selenium");
			
			obj.abc("selenium", "Selenium");
			
			obj.abc("Selenium", "Selenium");
			
	}

}
