package ReverseString;

public class Demo2 {

	public static void main(String[] args) {
		String a="DNYANESHWAR";
		
		int xyz=a.length()-1;
		for (int i=xyz;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
				
	}

}
