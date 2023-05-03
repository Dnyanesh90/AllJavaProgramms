package Tutorial10;

public class Demo13 {

	public static void main(String[] args) {
		String a="selenium";
		
		char [] abc =a.toCharArray();
		
		//System.out.println(abc[7]);
		
		for(int i=0;i<abc.length;i++)
		{
			System.out.print(abc[i]);
		}
		
		System.out.println();
		for(int i=abc.length-1;i>=0;i--)
		{
			System.out.print(abc[i]);
		}
	}

}
