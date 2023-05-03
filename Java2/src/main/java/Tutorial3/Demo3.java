package Tutorial3;

public class Demo3 {

	public static void main(String[] args) {
		String a=" Dnyaneshwar";
		String b=" Vyankatrao";
		String c=" kadam";
		
		int p=a.length()-1;
		int q=b.length()-1;
		int r=c.length()-1;
		for (int i=p;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		for (int i=q;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}
		for (int i=r;i>=0;i--)
		{
			System.out.print(c.charAt(i));
		}
	}

}
