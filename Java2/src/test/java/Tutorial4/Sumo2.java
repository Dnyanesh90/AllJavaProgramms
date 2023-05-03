package Tutorial4;

public class Sumo2 {

	public static void main(String[] args) {
		String a="Selenium";
		String b="TestNG";
		String c= new String("Selenium");
		String d= new String("TestNG");
		String e="Selenium";
		String f="TestNG";
		String g= new String("Selenium");
		String h= new String("TestNG");
		
		
		System.out.println(a.equals(c));
		System.out.println(b.equals(d));
		System.out.println(a.equals(e));
		System.out.println(b.equals(f));
		
		System.out.println("----------");
		
		System.out.println(a==c);
		System.out.println(b==d);
		System.out.println(a==e);
		System.out.println(b==f);
		
		System.out.println("----------");
		
		System.out.println(c.equals(g));
		System.out.println(d.equals(h));
		System.out.println(c==g);
		System.out.println(d==h);
		
	}

}
