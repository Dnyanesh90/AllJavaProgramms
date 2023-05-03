package Tutorial6;

public class Demo1 {

	public static void main(String[] args) {
        String a="KADAM";
		
		int abc=a.length()-1;
		

		for(int i=abc;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		System.out.println(a.substring(2));
		{
			System.out.println(a.charAt(abc));
		}
	
		
	}

}
