package ReverseString;

public class Demo9 {

	public static void main(String[] args) {
		String a="Rushikesh,Dnyaneshwar,Manjunath,Ramnath";
		String[] s =a.split(",");
		String op="";
		
		for(String x:s)
		{
			String r="";
			for(int i=x.length()-1;i>=0;i--)
			{
				r =r+x.charAt(i);
			}
			
			op= op+r+",";
		}
		
		System.out.println(op.subSequence(0, op.length()-1));
			
			
		}
		

	}


