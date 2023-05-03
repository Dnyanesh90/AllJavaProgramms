package SetCollectionDemo;

import java.util.HashSet;

public class Demo1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
        HashSet hs =new HashSet();
		
		System.out.println(hs.add("Selenium"));
		hs.add("POM");
		hs.add("cucumber");
		hs.add("Jenkins");
		System.out.println(hs.add("Selenium"));
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));
		
		System.out.println(hs);
	}

}
