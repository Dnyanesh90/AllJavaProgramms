package Tutorial;

public class Demo4 {

	public static void main(String[] args) {
		String a="ABCD1234@#$";
		String b= a.substring(0, 8)	;
		System.out.println(b);
		for (int i=b.length()-1;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}

	}

}
