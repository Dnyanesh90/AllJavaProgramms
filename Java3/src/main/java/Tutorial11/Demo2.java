package Tutorial11;

public class Demo2 {

	public static void main(String[] args) {
		Integer a=100;
		Integer b=300;
		Integer c=40;
		Integer d=100;
		
		System.out.println(a.compareTo(b));//-1
		System.out.println(a.compareTo(c));//1
		System.out.println(a.compareTo(d));//0
		System.out.println(b.compareTo(a));
		System.out.println(b.compareTo(c));
		System.out.println(b.compareTo(d));
		System.out.println( c.compareTo(a));
		System.out.println(c.compareTo(b));
		System.out.println(c.compareTo(d));
		System.out.println(d.compareTo(a));
		System.out.println(d.compareTo(b));
		System.out.println(d.compareTo(c));
		
	}

}
