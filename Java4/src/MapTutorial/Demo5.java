package MapTutorial;

import java.util.Hashtable;
import java.util.Map;

public class Demo5 {

	
	public static void main(String[] args) {
		Hashtable h1 = new Hashtable<Object, Object>();

		h1.put(101, "A");
		h1.put(102, "B");
		h1.put(103, "C");
		h1.put(true, "D");
		h1.put(104, "E");
		h1.put(105, "F");

		System.out.println(h1);

		System.out.println(h1.containsKey(104));

		System.out.println(h1.containsValue("D"));

		//for (Map.Entry abc :h1.entrySet()) 
		{
			//System.out.println(abc.getKey() + " " + abc.getValue());
		}

	}

}
