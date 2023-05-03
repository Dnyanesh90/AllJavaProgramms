package Tutorial3;

public class Demo4 {

	public static void main(String[] args) {
		String a="Selenium";
		String b="selenium";
		String c="SELENIUM";
		String d="selenium";
		String e="SELENIUM";
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(c==d);
		System.out.println(d==e);
		
		System.out.println("-----------------");
		
		System.out.println(a.concat(b));
		System.out.println(b.concat(c));
		System.out.println(c.concat(d));
		System.out.println(d.concat(e));
		
		System.out.println("----------------");
		
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));
		System.out.println(d.equals(e));
		
		System.out.println("-------------");
		
		System.out.println(b.equals(d));
		System.out.println(c.equals(e));
		System.out.println(b==d);
		System.out.println(e==c);

	}

}
