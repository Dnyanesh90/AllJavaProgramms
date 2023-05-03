package ReverseString;

public class Demo5 {

	public static void main(String[] args) {
		String a="selenium";
		
		System.out.println(a.charAt(4));
		
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		
	}
}