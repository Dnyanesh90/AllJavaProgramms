package Tutorial;

public class Demo2 {

	public static void main(String[] args) {
		String s="hjgu8$47f5&^%$";
		char ch[]=s.toCharArray();
       
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i])||Character.isDigit(ch[i]))
			{
				System.out.print(ch[i]);

	}

		}
	}
}

//o/p-hjgu847f5