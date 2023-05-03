package Array;

public class Demo10 {

	public static void main(String[] args) {
		String abc[]=new String [5];
		abc[0]="Rushikesh";
		abc[1]="Dnyaneshwar";
		abc[2]="Manjunath";
		abc[3]="Shesh";
		abc[4]="Vivek";
		
		for(int i=0;i<=4;i++)
		{
			String b=abc[i];
			for(int j=b.length()-1;j>=0;j--)
			{
				System.out.print(b.charAt(j));
			}
			System.out.println();
		}

	}

}
