package String;

public class Demo5 {

	public static void main(String[] args) {
		String a="1a2b3c4d5e";
		String b="";
		String s="";
		
		for(int i=0;i<=a.length()-1;i++)
		{
		char c=a.charAt(i);
		if (Character.isDigit(c))
		{
			b=b+c;
		}
		else
		{
			s=s+c;
		}
		}				
			System.out.println(b+s);
		}
}

