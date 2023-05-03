package Tutorial17;

public class Demo4 {

	public static void main(String[] args) {
		String a="D1N2Y3A4N5E6S7H8W9A10R";

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