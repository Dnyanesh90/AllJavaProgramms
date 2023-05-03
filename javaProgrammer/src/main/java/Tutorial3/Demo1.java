package Tutorial3;

public class Demo1 {

	public static void main(String[] args) {
		String a=" rawhsenaynD";
		String b="madak";
		
		int x=a.length()-1;
		int y=b.length()-1;
		
		for(int i=x;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		for(int j=y;j>=0;j--)
		{
			System.out.print(b.charAt(j));
		}
	}

}
