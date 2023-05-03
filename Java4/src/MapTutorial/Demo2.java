package MapTutorial;

import java.util.HashMap;

public class Demo2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap<Object, Object> h = new HashMap();

		h.put(101, "A");
		h.put(102, "B");
		h.put("Abc", "C");
		h.put(true, "D");
		h.put("xyz", "H");
		h.put(103, null);
		h.put(null, "K");

		System.out.println(h);

		System.out.println(h.remove(102));
		
		System.out.println(h.remove(102, null));
		System.out.println(h);	

	}

}
