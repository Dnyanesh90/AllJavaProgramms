package Tutorial6;

public class Demo3 {

	public static void main(String[] args) 
	{
		String a="KADAM";
		for (int i=0;i<a.length();i++)// 0
		{
			for (int j=0;j<=i;j++)// 0
			{
				System.out.print(a.charAt(j)+"");

			}

                System.out.println(" ");
		}
		}
	}

//Output-
//K 
//KA 
//KAD 
//KADA 
//KADAM 


