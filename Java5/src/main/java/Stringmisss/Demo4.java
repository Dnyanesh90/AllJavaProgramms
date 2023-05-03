package Stringmisss;

public class Demo4 {

	public static void main(String[] args) {
		String a="selenium";
		
		char[] abc =a.toCharArray();
		
		System.out.println(abc.length);
		
		System.out.println(abc[4]);
		
		for(int i=abc.length-1;i>=0;i--)
		{
			System.out.print(abc[i]);
		}
		
	}

}
