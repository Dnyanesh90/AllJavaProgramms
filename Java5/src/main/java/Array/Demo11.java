package Array;

public class Demo11 {

	public static void main(String[] args) {
		//declare string type of array
		
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
				System.out.println(abc[2]+abc[4]);
				System.out.println(abc[4]-abc[1]);
				
				
				for (int i=0;i<5;i++)
				{
					System.out.println(abc[i]);
				}

	}

}
