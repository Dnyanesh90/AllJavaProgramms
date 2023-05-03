package MapTutorial;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo6 {

	public static void main(String[] args) {
		LinkedHashMap<Object, Object> a = new LinkedHashMap<Object, Object>();

		a.put("ABC",123 );
		a.put("DEF", 456);
		a.put("GHI",789 );
		for(Map.Entry<Object, Object> pqr:a.entrySet())
		{
			System.out.println(pqr.getValue());
		}

	}

}
