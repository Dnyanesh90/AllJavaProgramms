package ReverseString;

public class Demo10 {

	public static void main(String[] args) {
		String a="Pune,Delhi,Banglore,Chennai";
		String[] b =a.split(",");
		String c="";
		
		for(String x:b)
		{
			String r="";
			for(int i=x.length()-1;i>=0;i--)
			{
				r=r+x.charAt(i);
			}
			c=c+r+",";
		
		}
		System.out.println(c.subSequence(0, c.length()-1));
		
		
	}

}
