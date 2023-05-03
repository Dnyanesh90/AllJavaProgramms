package Tutorial6;

public class Demo11 {

	public static void main(String[] args) {

		int [] abc = new int[5];
		abc[0]=100;
		abc[1]=200;
		abc[2]=300;
		abc[3]=400;
		abc[4]=500;
		
		int [] xyz = {abc[2],abc[1]};
		
		System.out.println(xyz[0]);
	
		System.out.println(xyz[1]);
		
	}

}
