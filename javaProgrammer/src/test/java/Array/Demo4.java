package Array;

public class Demo4 {

	public static void main(String[] args) {
		int pqr[]= new int[5];
		
		pqr[0]=40;
		pqr[1]=10;
		pqr[2]=20;
		pqr[3]=5;
		pqr[4]=30;
		
		int mini = pqr[0];
		for(int i=0;i<=4;i++)
		
		{
			if(mini>pqr[i])
			{
				mini=pqr[i];
			}
		}
		System.out.println(mini);
	}
	
	

}
