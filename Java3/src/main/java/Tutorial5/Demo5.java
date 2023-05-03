package Tutorial5;

public class Demo5 {

	public static void main(String[] args) {
		String a="Selenium";
		String b="selenium";
		String c="SELENIUM";
		String d="selenium";
		
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.equalsIgnoreCase(d));
		System.out.println(b.equalsIgnoreCase(d));

	}

}
