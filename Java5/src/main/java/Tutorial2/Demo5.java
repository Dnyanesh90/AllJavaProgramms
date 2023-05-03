package Tutorial2;

public class Demo5 {

	public static void main(String[] args) {
		int a=150;
		int b=100;
		int c=100;
		
		System.out.println(a==b);  //false
		System.out.println(b==c);  //true
		System.out.println(a==c);  //false
		
		
		System.out.println(a!=b);  //true
		System.out.println(b!=c);  //false
		System.out.println(c!=a);  //true
		
		System.out.println(a>b);  //true
		System.out.println(b>c);  //false
		System.out.println(c>a);  //false
		
		System.out.println(a<b);  //false
		System.out.println(a<c);  //false
		System.out.println(b<c);  //false
		
		System.out.println(a>=b);  //true
		System.out.println(b>=c);  //true
		System.out.println(c>=a); //false
		
		System.out.println(c<=a);  //true
		System.out.println(c<=b);  //true

	}

}
