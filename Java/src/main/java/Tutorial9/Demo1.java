package Tutorial9;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		String a="DNYANESHWAR VYANKATRAO KADAM";
		
		Set<Character> set =new LinkedHashSet<Character>();
		for(int i=0;i<a.length();i++)
		{
			set.add(a.charAt(i));
		}
		StringBuffer sb =new StringBuffer();
		//StringBuilder sb =new StringBuilder();
		for(Character c:set)
		{
			sb.append(c);
		}
		System.out.println(""+sb);
			
		}
		
	}


//OUTPUT-DNYAESHWR VKTOM