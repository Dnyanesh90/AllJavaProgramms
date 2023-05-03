package Tutorial10;

public class Demo12 {

	public static void main(String[] args) {
		String a="selenium TestNG";
		
		char[] abc =a.toCharArray();
		
		System.out.println(abc.length);
		
		System.out.println(abc[5]);
		
		for(int i=abc.length-1;i>=0;i--)
		{
			System.out.print(abc[i]);
		}
	}

}
