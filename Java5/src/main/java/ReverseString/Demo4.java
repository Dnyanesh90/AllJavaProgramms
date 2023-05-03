package ReverseString;

public class Demo4 {

	public static void main(String[] args) {
		String a=" rawhsenaynD";
		String b=" madaK";
		String c=" rakrutaL";
		
		int abc=a.length()-1;
		int xyz=b.length()-1;
		int pqr=c.length()-1;
		
		for (int i=abc;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		for(int i=xyz;i>=0;i--)
		{
		System.out.print(b.charAt(i));	
		}
		for(int i=pqr;i>=0;i--)
		{
			System.out.print(c.charAt(i));
		}

	}

}
