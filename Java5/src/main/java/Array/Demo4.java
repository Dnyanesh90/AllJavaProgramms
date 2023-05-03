package Array;

public class Demo4 {

	public static void main(String[] args) {

		float [] abc =new float[4];
		
		abc[0]=10.45f;
		abc[1]=34.55f;
		abc[2]=3556.445f;
		abc[3]=45.45f;
		
		
		System.out.println(abc[1]+abc[2]);
		System.out.println(abc[1]+abc[2]+abc[3]);
		System.out.println(abc[2]-abc[3]-abc[1]-abc[0]);
		
		for(int i=0;i<4;i++)
		{
			System.out.println(abc[i]);
		}

	}

}
