package JavaVariables;

public class Demo3 {
	//global static 
		static String a="java";
		//gloabl instance variable
		String b="testng";
		
		static 
		{
			System.out.println("static block");
			//local variable
			String c="cucumber";
			System.out.println(a);
			System.out.println(new Demo3().b);
			System.out.println(c);
			
		}
		
		public void m1()
		{
			int p=100;
			System.out.println(a);
			System.out.println(b);
			
			if(true)
			{
				int d=10;
				System.out.println(a);
				System.out.println(b);
				System.out.println(p);
			}	
			
		}
		
		public static void m2()
		{
			int q=10;
			System.out.println(a);
			System.out.println(new Demo3().b);
		}
		
		
		public static void main(String[] args) {
			System.out.println("main method is started");
			Demo3 obj =new Demo3();
			obj.m1();
			Demo3.m2();
		}

}
