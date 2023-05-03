package ListCollectionDemo;

import java.util.Vector;

public class Demo5 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Vector v =new Vector();
		
		v.add("A");
		v.add("B");
		v.add(null);
		v.add("100");
		v.add("A");
		
		System.out.println(v);
		
		System.out.println(v.remove(2));
		
		System.out.println(v);	

		v.set(0, "HTML");
		
		System.out.println(v);
		
	}

}
