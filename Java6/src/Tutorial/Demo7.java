package Tutorial;

public class Demo7 {

	public static void main(String[] args) {
		String a="KADAM";
		String b="";
		for(int i=0;i<=a.length()-1;i++)
		{
			if(a.charAt(i)=='A')
			{
				b=b+'&';
				System.out.print(b);
			}
			else
			{
				System.out.print(a.charAt(i));
			}
		}

	}

}
