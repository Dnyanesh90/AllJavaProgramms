package Tutorial16;

public class Demo6 {

	public static void main(String[] args) {
		String a = "Selenium123@#aabc";

		char[] abc = a.toCharArray();

		for(int i=0;i<abc.length;i++)
		{
			
			if(Character.isDigit(abc[i]))
			{
				System.out.println("Int Value are :"+abc[i]);
			}
			else if(Character.isAlphabetic(abc[i]))
			{
				System.out.println("Alphabet are :"+abc[i]);
			}
			else {
				System.out.println("Special charactar are "+abc[i]);
			}
			
			
		}
	}

}
