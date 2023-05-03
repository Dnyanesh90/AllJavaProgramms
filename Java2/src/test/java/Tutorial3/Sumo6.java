package Tutorial3;

public class Sumo6 {

	public static void main(String[] args) {
		String a="Selenium";
		String b="SELENIUM";
		String c="Selenium";
		String d="SELENIUM";
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println("--------");
		
		System.out.println(a.equals(b));
		
		System.out.println("--------");
		System.out.println(a.equals(c));
		System.out.println(a==c);
		
		System.out.println("--------");
		System.out.println(a.equals(d));
		System.out.println("--------");
		
		System.out.println(b==c);
		System.out.println(b==d);
		System.out.println(b==a);
	}

}
