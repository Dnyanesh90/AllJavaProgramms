package Tutorial13;

public class Demo9 {

	public static void main(String[] args) {
		String a=" Hello";
		String b="World";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		for (int i=b.length()-1;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}
	}

}
