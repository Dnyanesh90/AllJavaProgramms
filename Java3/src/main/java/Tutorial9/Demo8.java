package Tutorial9;

public class Demo8 {
	public static int minimumNumber() {

		int a[] = { 10, 30, 40, 5, -700, -400 };

		int min = a[0];

		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] < min) 
			{
				min = a[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		System.out.println("MMS");

		int b = Demo8.minimumNumber();
		System.out.println(b);

		System.out.println("MME");
	}

}
