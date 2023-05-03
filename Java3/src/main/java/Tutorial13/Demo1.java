package Tutorial13;

public class Demo1 {

	public static void main(String[] args) {
		int a=1000;
		int b=120;
		int c=900;
		
		if((a>b)&&(a>c))
		{
			System.out.println("a is big number");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("b is big number");
		}
		else{
			System.out.println("c is big number");
		}
}
}