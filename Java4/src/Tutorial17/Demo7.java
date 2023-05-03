package Tutorial17;

public class Demo7 {

	public static void main(String[] args) {
		String a="D1N2Y3A4N5E6S7H8W9A10R";
		
		char[] p=a.toCharArray();
		for(int i=0;i<p.length;i++)
		{
			if(Character.isDigit(p[i]))
			{
				System.out.print(p[i]);
			}
		}
	}

}
