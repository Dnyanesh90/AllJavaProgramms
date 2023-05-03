package StaticNonStatic1;

public class Demo7 {
	public static void m1(int a, int b, int c)
	{
		System.out.println(a>b);
		System.out.println(a>c);
		System.out.println(b>c);
		System.out.println(b>a);
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a=b);
		System.out.println(b=c);
		System.out.println(a+b+c);
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		Demo7.m1(150, 100, 100);
		System.out.println("MME");
		

	}

}
