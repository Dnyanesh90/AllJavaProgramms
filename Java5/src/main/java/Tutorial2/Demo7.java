package Tutorial2;

public class Demo7 {

	public static void main(String[] args) {
		int a=100;
		int b=50;
		int c=150;
		
		System.out.println(a>b);
		System.out.println(b>c);
		System.out.println(c>a);
		
		System.out.println((a>b)&&(b>c));
		System.out.println((a>b)&&(c>a));
		System.out.println((c>a)&&(c>b));
		
		
		System.out.println((a>b)&&(a<c));
		System.out.println((b>c)&&(b<c));
		
	}

}
