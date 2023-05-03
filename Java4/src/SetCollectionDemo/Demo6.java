package SetCollectionDemo;

import java.util.TreeSet;

public class Demo6 {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		TreeSet t = new TreeSet();

		t.add("Selenium");
		t.add("Pom");
		t.add("cucumber");
		t.add("github");

		// t.add(null);not allowed
		// t.add(1000): hetrogenouse object are not allowed.

		for (Object o : t) {
			System.out.println(o);
		}

		System.out.println(t.contains("Pom"));

		Object o = t.clone();
				
		TreeSet abc =(TreeSet) t.clone();
		
		System.out.println(abc);
	}

}
