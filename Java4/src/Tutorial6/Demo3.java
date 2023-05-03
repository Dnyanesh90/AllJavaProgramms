package Tutorial6;

public class Demo3 {
	private static Demo3 obj;


	public Demo3(int a,int b) {
		System.out.println("2 int args cons");
	}
	
	public Demo3() {
		System.out.println("0 args");
	}
	
	
	public static void main(String[] args) {

		setObj(new Demo3(10,10));
		
	}

	public static Demo3 getObj() {
		return obj;
	}

	public static void setObj(Demo3 obj) {
		Demo3.obj = obj;
	}

}
