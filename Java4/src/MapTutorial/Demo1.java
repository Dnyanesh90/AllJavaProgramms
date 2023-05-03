package MapTutorial;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	
	
	public static void main(String[] args) {
		HashMap h = new HashMap();

		h.put(101, "A");
		h.put(102, "B");
		h.put("Abc", "C");
		h.put(true, "D");
		h.put("xyz", "H");
		h.put(103, null);
		h.put(null, "K");

		System.out.println(h);

		System.out.println(h.containsKey("Abc"));

		System.out.println(h.containsValue("B"));

	    //for (Map.Entry abc : h.entrySet()) {
			//System.out.println(abc.getKey() + " " + abc.getValue());

		}
	}


