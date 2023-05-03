package ifelse;

public class Demo6 {

	public static void main(String[] args) {
		int a = 100, b = 2200, c = 2900, d = 220;

		// find out big number out of 4 number.
		if ((a > b) && (a > c) && (a > d)) 
		{
			System.out.println("A is big number");
		} 
		else if ((b > a) && (b > c) && (b > d)) 
		{
			System.out.println("B is big number");
		} 
		else if ((c > a) && (c > b) && (c > d)) 
		{
			System.out.println("C is big number");
		} 
		else 
		{
			System.out.println("D is big number");
		}
	}

}
