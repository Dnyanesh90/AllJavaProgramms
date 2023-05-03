package Array;

public class Demo8 {

	public static void main(String[] args) {
		int [] abc =new int[5];
		abc[0]=10;
		abc[1]=20;
		abc[2]=30;
		abc[3]=40;
		abc[4]=50;
		
		for(int pqr:abc)
		{
			System.out.println(pqr);
		}
		for (int i=0;i<5;i++)
		{
			System.out.println(abc[i]);
		}

	}

}
