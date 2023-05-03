package Array;

public class Demo8 {

	public static void main(String[] args) {
        String abc [] = new String[5];
		
		abc[0]="selenium";
		abc[1]="testNG";
		abc[2]="cucumber";
		abc[3]="jenkins";
		abc[4]="GitHub";
		
		for(int j=0;j<=4;j++)
		{
			String b =abc[j];//selenium  testng cucumber
			
			for(int i=b.length()-1;i>=0;i--)
			{
				System.out.print(b.charAt(i));//muineles
											//GNtset
			}
		
			System.out.println();
			
		}
		

	}

}
