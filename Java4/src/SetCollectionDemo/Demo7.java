package SetCollectionDemo;

import java.util.TreeSet;

public class Demo7 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		TreeSet sh1 = new TreeSet();

		sh1.add("A");
		sh1.add("B");
		sh1.add("C");
		sh1.add("D");

		TreeSet sh2 = new TreeSet();
		sh2.add("1");
		sh2.add("2");
		sh2.add("3");
		sh2.add("4");

		
		System.out.println(sh1);
		System.out.println(sh2);
		sh2.addAll(sh1);
		System.out.println(sh2);
		
		sh1.retainAll(sh2);
		
		System.out.println(sh1);
		
		
		sh1.removeAll(sh2);
		
		System.out.println(sh1);

	}

}
