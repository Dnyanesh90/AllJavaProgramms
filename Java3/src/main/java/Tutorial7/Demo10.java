package Tutorial7;

public class Demo10 {

	// non static method without return type and 1 string and 1 int parameter

			public void abc(String a, int b){
				System.out.println(a+b);
			}
			

			public static void main(String[] args) {
				
				Demo10 obj =new Demo10();
				
				obj.abc("Selenium",100);

	}

}
