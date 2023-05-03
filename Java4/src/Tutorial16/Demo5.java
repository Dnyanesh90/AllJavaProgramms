package Tutorial16;

public class Demo5 {

	public static void main(String[] args) {
		String a = "abc123d";

		char[] abc = a.toCharArray();

		for (int i = 0; i < abc.length; i++) 
		{
			if (Character.isAlphabetic(abc[i])) 
			{
				System.out.print(abc[i]);
			}
		}

	}

}
