package Tutorial10;

public class Dem1 {

	public static void main(String[] args) {
		String a="selenium";
		String b="Selenium";
		String c="SELENIUM";
		String d="selenium";
		
		System.out.println(a.equals(b));//f
		System.out.println(a.equals(c));//f
		System.out.println(a.equals(d));//true
		
		System.out.println(a.equalsIgnoreCase(b));//t
		System.out.println(a.equalsIgnoreCase(c));//t
		System.out.println(a.equalsIgnoreCase(d));//true
	}

}
