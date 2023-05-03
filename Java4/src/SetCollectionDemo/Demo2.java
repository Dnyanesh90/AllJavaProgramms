package SetCollectionDemo;

import java.util.HashSet;

public class Demo2 {

	
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add("Selenium");
		hs.add("POM");
		hs.add("cucumber");
		hs.add("Jenkins");
		hs.add(null);
		hs.add(1000);
		hs.add(true);

		
		boolean a=hs.remove("cucumber");
		System.out.println(a);
		System.out.println(hs);
		
		hs.add("github");
		
		
		System.out.println(hs);
		
		System.out.println(hs.contains("POM"));
		
		
		
		//System.out.println(hs);
//		for(Object o:hs)
//		{
//			System.out.println(o);
//		}		

	}

}
