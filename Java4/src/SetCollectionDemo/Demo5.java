package SetCollectionDemo;

import java.util.LinkedHashSet;

public class Demo5 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
       LinkedHashSet hs1 =new LinkedHashSet();
		
		hs1.add("A");
		hs1.add("B");
		hs1.add("C");
		hs1.add("D");
		
		
		LinkedHashSet sh2 =new LinkedHashSet();
		sh2.add(10);
		sh2.add(100);
		sh2.add(200);
		sh2.add(300);
		
		System.out.println(hs1);
		System.out.println(sh2);
		hs1.addAll(sh2);
		System.out.println(hs1);	
		
		hs1.retainAll(sh2);
		
		System.out.println(hs1);
		
		hs1.removeAll(sh2);	
		System.out.println(hs1);
		

	}

}
