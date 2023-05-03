package Array;

public class Demo14 {

	public static void main(String[] args) {
		int [] abc = new int[5];
		abc[0]=100;
		abc[1]=200;
		abc[2]=300;
		abc[3]=400;
		abc[4]=500;
		
		for(int a:abc)
		{
			System.out.println(a);
		}
		
		System.out.println("--------------------------");
		int [] xyz=abc;
		
		for(int p:xyz)
		{
			System.out.println(p);
		}
	}

}
