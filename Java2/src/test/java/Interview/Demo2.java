package Interview;

public class Demo2 {

	public static void main(String[] args)
	{
		String a="KADAM POKALE TUMBERPHALE";
		String p[]=a.split(" ");
		String b="";
		for(int j=p.length-1;j>=0;j--)
		{
		for(int i=0;i<p[j].length();i++)
		{
			b=p[j].charAt(i)+b;
		}
		    b=" "+b;
		}
		System.out.println(b);
		}
		}

	

//output-----------MADAK ELAKOP ELAHPREBMUT