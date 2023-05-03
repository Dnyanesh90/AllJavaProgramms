package Tutorial2;

public class Demo4 {

	public static void main(String[] args) {
		int a = 18000000;

		if (a >= 1) 
		{
			if (a <= 100) 
			{
				System.out.println("A is small Number");
			} 
			else if (a <= 1000) 
			{
				System.out.println("A is Medium Number");
			} 
			else if (a <= 10000) 
			{
				System.out.println("A is large Number");
			} 
			else if (a >= 10001) {
				System.out.println("A is Biggest number");
			}
		} 
		else {
			System.out.println("A is zero or negative number");
	}

}
}