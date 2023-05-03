package Tutorial9;

public class Demo7 {

	public static String xyz(int a,int b, int c) {
		
		if((a>b)&&(a>c))
		{
			return "a is biggest number";
		}
		else if(b>c)
		{
			return "b is biggest number";
		}
		else {
			return "C is biggest number";
	}

}
	public static void main(String[] args) {
		System.out.println("MMS");
		
		String d=Demo7.xyz(10, 32000, 30000);
		System.out.println(d);
		System.out.println("MME");
		
	}

}