package Tutorial11;

public class Demo4 {

	public static void main(String[] args) {
		double a=100.40;
		int b=200;
		int c=345;
		
		System.out.println(Math.max(a, b));//200
		
		System.out.println(Math.max(c, b));//345
		
		System.out.println(Math.min(a, b));//100.4
		
		System.out.println(Math.min(b, c));//200
	}

}
