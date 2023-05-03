package MapTutorial;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo3 {

	public static void main(String[] args) {
		LinkedHashMap<Object, Object> h1 = new LinkedHashMap<Object, Object>();

		h1.put(101, "A");
		h1.put(102, "B");
		h1.put(103, "C");
		h1.put(true, "D");
		h1.put(null, "E");
		h1.put(104, null);
		h1.put(105, null);
		
		
		//System.out.println(h1.containsKey(105));
		
		//System.out.println(h1.remove(103));
		
		for(Map.Entry<Object, Object> abc:h1.entrySet())
		{
			System.out.println(abc.getValue());
		}
	}

}
