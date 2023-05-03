package StaticNonStatic1;

public class Demo6 {
	public static void abc(String a, String b)
	{
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a==b);
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));
	}

	public static void main(String[] args) {
		System.out.println("mms");
		Demo6.abc("Selenium", "Selenium");
		System.out.println("mme");
		Demo6.abc("Selenium", "selenium");
		System.out.println("mms");
		

	}

}
