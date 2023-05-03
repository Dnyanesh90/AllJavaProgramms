package String;

public class Demo2 {

	public static void main(String[] args) {
         
		String a=" Hellow";
		String b="World";
		
		int abc=a.length()-1;
		int xyz=b.length()-1;
		
		for(int i=abc;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		for(int i=xyz;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}
	}
	

}
