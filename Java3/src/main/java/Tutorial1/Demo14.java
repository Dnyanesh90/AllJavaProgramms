package Tutorial1;

public class Demo14 {

	public static void main(String[] args) {
		int a=80;
		int b=50;
		int c=100;
		
		boolean d=a>b;
		System.out.println(d);
		boolean e=a>c;
		System.out.println(e);
		
		System.out.println(d&&e);//f
		
		System.out.println((a>b)&&(a>c));//false
		
		
		System.out.println((a>b)||(a>c));//true
		
	
	
	System.out.println(!((a>b)&&(a>c)));//true
	System.out.println(!((a>b)||(a>c)));//false
	}

}
