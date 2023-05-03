package Tutorial3;

public class Sumo7 {

	public static void main(String[] args) {
		String a="Selenium";
		String b="SELENIUM";
		String c="Selenium";
		String d="SELENIUM";
		String e="SeLenium";
		String f="SeLENIUM";
		String g="SElEnium";
		String h="sELENIUM";
		
		
		
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(a.compareTo(d));
		System.out.println("-------");
		
		System.out.println(e.compareTo(f));
		System.out.println(e.compareTo(g));
		System.out.println(e.compareTo(h));
	}

}
