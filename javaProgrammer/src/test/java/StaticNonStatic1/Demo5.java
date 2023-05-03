package StaticNonStatic1;

public class Demo5 {
	public static void xyz(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a!=b);
		System.out.println(a=b);
		System.out.println(a%b);
		a++;
		System.out.println(a);
		b++;
		System.out.println(b++);
		a--;
		System.out.println(a--);
		b--;
		System.out.println(b--);
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		Demo5.xyz(10, 2);
		System.out.println("MME");
		

	}

}
