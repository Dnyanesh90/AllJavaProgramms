package String;

public class Demo7 {

	public static void main(String[] args) {
		String a="SELENIUM123TestNG456CUCUMBER789";
		String b="";
		String s="";
		
		
		for(int i=0;i<=a.length()-1;i++)
		{
			char c=a.charAt(i);
			if(Character.isDigit(c))
			{
				b=b+c;
			}
			else
			{
				s=s+c;
			}
		}
		System.out.println(b+s);
		}
		
	}
//OUTPUT-123456789SELENIUMTestNGCUCUMBER