package Tutorial;

public class Demo3 {

	public static void main(String[] args) {
		String str="ABCD234@#$";
		char[]abc=str.toCharArray();
		String a="";
		for(int i=0;i<=abc.length-1;i++)
		{
			
			if((Character.isAlphabetic(abc[i]))||(Character.isDigit(abc[i])))
			{	
				a=a+abc[i];
			}
		}
		System.out.println(a);
		for(int j=a.length()-1;j>=0;j--)
		{
			System.out.print(a.charAt(j));
		}
	}
	}
//o/p-ABCD234
//    432DCBA

