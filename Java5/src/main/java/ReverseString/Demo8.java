package ReverseString;

public class Demo8 {

	public static void main(String[] args) {
		
		String a="Kadam,Shete,Ramnath,Shinde,Patil";
		String[] s = a.split(",");
		String output="";
		for(String x:s)
		{
			String rev="";
             for(int i=x.length()-1;i>=0;i--)
				
			{
				rev=rev+x.charAt(i);
			}
			output=output+rev+",";
		}
		System.out.println(output.subSequence(0, output.length()-1));
		}
	}


