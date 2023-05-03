package Array;

public class Demo9 {

	public static void main(String[] args) {
		int pqr[]=new int[5];
		pqr[0]=3550;
		pqr[1]=250;
		pqr[2]=350;
		pqr[3]=450;
		pqr[4]=550;
		
		int min= pqr[0];
		for(int i=0;i<=4;i++)
		{
			if(min<pqr[i]);
			{
				min=pqr[i];
			}
		}
		System.out.println(min);

	}

}
