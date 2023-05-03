package ReverseString;

public class Demo6 {

	public static void main(String[] args) {
		String a=" Nayan";
		String b=" Gaurav";
		String c=" Nikhil";
		String d=" jay";
		
		int v=a.length()-1;
		int x=b.length()-1;
		int y=c.length()-1;
		int z=d.length()-1;
		
		for (int i=v;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		for (int i=x;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}
		for (int i=y;i>=0;i--)
		{
			System.out.print(c.charAt(i));
		}
		for (int i=z;i>=0;i--)
		{
			System.out.print(d.charAt(i));
		}

	}

}
