package Tutorial8;

public class Demo2 {

	public int minimumNumber() {
		int abc[] = { 10, 3000, 50, 600, 700, 100 };

		int min = abc[0];

		for (int i = 1; i < abc.length; i++) 
		{
			if (abc[i] < min) {
				min = abc[i];
			}
		}

		return min;

	}

	public static void main(String[] args) {

		Demo2 obj = new Demo2();
		int a = obj.minimumNumber();
		System.out.println(a);
}

}
