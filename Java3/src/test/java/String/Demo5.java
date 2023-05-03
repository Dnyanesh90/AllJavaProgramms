package String;

public class Demo5 {

	public static void main(String[] args) {
		String a="Hello";
		int abc=a.length()-1;
		for(int i=abc;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		String b="World";
		int xyz=b.length()-1;
		for(int i=xyz;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}

	}

}
