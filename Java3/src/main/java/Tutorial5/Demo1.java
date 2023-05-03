package Tutorial5;

public class Demo1 {

	public static void main(String[] args) {
		String a="selenium";
		String b="Selenium";
		String c="SELENIUM";
		String d="selenium";
		
		System.out.println(a==b);//false		
		System.out.println(a==c);//false		
		System.out.println(a==d);//true
		
		System.out.println("----------------------");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		
	}

}
