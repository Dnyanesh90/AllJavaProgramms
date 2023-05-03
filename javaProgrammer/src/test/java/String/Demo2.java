package String;

public class Demo2 {

	public static void main(String[] args) {
		String a="123abc456def789ghi";
		String b="";
		String s="";
		
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(Character.isDigit(c))
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

//OUTPUT-123456789abcdefghi
