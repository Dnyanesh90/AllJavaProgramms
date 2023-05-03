package SetCollectionDemo;

import java.util.HashSet;

public class Demo4 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet sh1 = new HashSet();

		sh1.add("A");
		sh1.add("B");
		sh1.add("C");
		sh1.add("D");

		HashSet sh2 = new HashSet();
		sh2.add(1);
		sh2.add(2);
		sh2.add(3);
		sh2.add(4);

		System.out.println(sh1);
		sh1.addAll(sh2);
	
		System.out.println(sh1);

		sh1.removeAll(sh2);

		System.out.println(sh1);
		
		sh1.retainAll(sh2);
		
		System.out.println(sh1);
		
		HashSet abc=(HashSet) sh1.clone();
		
		System.out.println(abc);
	}

}
