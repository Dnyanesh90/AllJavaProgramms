package Tutorial4;

public class Sumo4 {

	public static void main(String[] args) {
		String a="XYZ,PQR,ABC";
		String[] b=a.split(",");
		String c="";
		for(String x:b)
		{
			String reverseString="";
			for (int i=x.length()-1;i>=0;i--)
			{
				reverseString=reverseString+x.charAt(i);
			}
			c=c+reverseString+",";
					
		}		
				System.out.println(c.subSequence(0, c.length()-1));
			}
		}
	
//output-
//ZYX,RQP,CBA




