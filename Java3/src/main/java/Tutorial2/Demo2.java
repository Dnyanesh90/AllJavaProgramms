package Tutorial2;

public class Demo2 {

	public static void main(String[] args) {
		int a = 1000, b = 2000, c = 290, d = 220;

		// find out big number out of 4 number.
		if ((a>b) && (a>c) && (a>d)) 
		{
			System.out.println("A is big number");
		} 
		else if ((b>c) && (b>d)) 
		{
			System.out.println("B is big number");
		} 
		else if (c>d)
		{
			System.out.println("C is big number");
		} 
		else 
		{
			System.out.println("D is big number");
		}

	}

}