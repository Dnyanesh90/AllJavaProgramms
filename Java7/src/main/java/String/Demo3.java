package String;

public class Demo3 {

	public static void main(String[] args) {
		String a="AIDNI ARTHSARAHAM RUTAL TOKLAJ ROONTA";
		String b[]=a.split(" ");
		String c="";
		for(int i=b.length-1;i>=0;i--)
		{
			for(int j=0;j<b[i].length();j++)
			{
				c=b[i].charAt(j)+c;
			}
			c=" "+c;
			}
		System.out.println(c);
		}
	}

//OUTPUT
//INDIA MAHARASHTRA LATUR JALKOT ATNOOR
