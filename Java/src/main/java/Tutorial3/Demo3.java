package Tutorial3;

public class Demo3 {

	public static void main(String[] args) {
		String a=" Hellow";
		String b="World";
		
		int p=a.length()-1;
		int q=b.length()-1;
		for (int i=p;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		for (int i=q;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}
	}

}
