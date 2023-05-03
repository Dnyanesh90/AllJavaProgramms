package Array;

public class Demo6 {

	public static void main(String[] args) {
		int abc[] =new int[5];
		abc[0]=60;
		abc[1]=30;
		abc[2]=65;
		abc[3]=80;
		abc[4]=90;
		
		int max=abc[0];
		
		for(int i=0;i<=4;i++)
		{
			if (max<abc[i]);		
		{
			max=abc[i];
		}
	}
		System.out.println(max);

}
}