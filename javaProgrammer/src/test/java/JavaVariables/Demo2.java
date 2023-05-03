package JavaVariables;

public class Demo2 {
	//static global variable
		static String c="selenium";
		
		//non static global variable or global instance variable
			String d="Testing";
			
		
		public static void m1()
		{
			int a=100;
			System.out.println(a);
			System.out.println(c);
			Demo2 obj =new Demo2();
			System.out.println(obj.d);
		}

		public void m2()
		{
			int b=100;
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}

		
		public static void main(String[] args) {
			System.out.println(c);
			Demo2 obj =new Demo2();
			System.out.println(obj.d);
			Demo2.m1();
			obj.m2();
		}

}
