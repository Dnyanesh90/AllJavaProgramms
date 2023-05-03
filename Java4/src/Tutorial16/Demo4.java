package Tutorial16;

public class Demo4 {

	public static void main(String[] args) {
		String a = "abc123def";

		char[] p = a.toCharArray();

		//System.out.println(Character.isDigit(p[3]));

		for (int i = 0; i < p.length; i++) 
		{
			if (Character.isDigit(p[i])) 
			{
				System.out.print(p[i]);//1  2  3
			}

		}
	}

}
