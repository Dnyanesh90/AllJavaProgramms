package String;

public class Demo4 {

	public static void main(String[] args) {
		String a="SELENIUM";
		String b="Selenium";
		String c="selenium";
		String d="sELENIUM";
		String e="SELENIUM";
		String f="selenium";
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(c==d);
		System.out.println(d==e);
		System.out.println(e==f);
		System.out.println(a==e);
		System.out.println(c==f);
		
		
		System.out.println(a.equals(e));
		System.out.println(c.equals(f));
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));
		System.out.println(d.equals(e));
		System.out.println(e.equals(f));

	}

}
