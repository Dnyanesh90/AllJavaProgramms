package Tutorial2;

import java.util.LinkedHashSet;

public class Demo2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		String a="madam";
		char b[]=a.toCharArray();
	
		LinkedHashSet ls= new LinkedHashSet();
		String c="";
		String d="";
		for(int i=0;i<b.length;i++)
		{
			if(ls.add(b[i]))//a/ false
			{
				c=c+b[i];//j a v
			}
			else
			{
				d=d+b[i];//a
			}
			
		
		}System.out.println(c);
		System.out.println(d);
		


	}

}
