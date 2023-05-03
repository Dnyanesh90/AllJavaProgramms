package Tutorial7;

public class Demo11 {

	// non static method without return type and arguments or parameter
		public void xyz(){
			
			System.out.println("Xyz Method in demo11 class");
			System.out.println("Non static method without return type");
		}
		
		// non static method without return type and 1 float and 1 int parameter
		public void abc(float a, int b){
			System.out.println(a+b);
		}
			
		public static void main(String[] args) {
			
			Demo11 obj =new Demo11();
			obj.abc(100.5f, 100);
			
			obj.xyz();

	}

}
