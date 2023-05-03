package Array;

public class Demo15 {

	public static void main(String[] args) {
		int [] abc = new int[5];
		abc[0]=100;
		abc[1]=200;
		abc[2]=300;
		abc[3]=400;
		abc[4]=500;
		
		int [] xyz = {abc[2],abc[0]};
		
		System.out.println(xyz[0]);
	
		System.out.println(xyz[1]);
		System.out.println("--------------------");
		for(int i=0;i<5;i++)
		{
			System.out.println(abc[i]);
		}
		System.out.println("---------------");
		for(int pqr:abc)
		
		System.out.println(pqr);
		System.out.println("----------------");
		for (int d:abc)
			System.out.println(d);
		

	}

}
