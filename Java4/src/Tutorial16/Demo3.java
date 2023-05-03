package Tutorial16;

public class Demo3 {

	public static void main(String[] args) {
        String  a="abce123d";
		
		char [] abc =a.toCharArray();
		
		System.out.println(Character.isDigit(abc[3]));
		
		for(int i=0;i<abc.length;i++)
		{
			if (Character.isAlphabetic(abc[i]))
		
		{
			System.out.print(abc[i]);
		}
		//System.out.println(a.substring(4));
		//System.out.println(a.substring(0, 5));

	}

}
}
