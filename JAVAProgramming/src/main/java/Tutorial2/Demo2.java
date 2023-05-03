package Tutorial2;

public class Demo2 {

	public static void main(String[] args) {
		String a = "Good "; 
		String b = "morning"; 
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		
		String temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("String a = " +a);
		System.out.println("String b = " +b);
		

	}

}
