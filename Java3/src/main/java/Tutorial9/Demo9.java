package Tutorial9;

public class Demo9 {
	public static String minimumNumber() {

		int a[] = { 10, 30, 40, 5, -200, -400 };

		int min = a[0];

		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] < min) 
			{
				min = a[i];
			}
		}
		return "Minimum number is "+min;
	}

	public static void main(String[] args) {

		System.out.println("MMS");

		String b = Demo9.minimumNumber();
		System.out.println(b);

		System.out.println("MME");
}
}