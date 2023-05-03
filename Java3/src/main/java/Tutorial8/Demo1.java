package Tutorial8;

public class Demo1 {

	public int maximumNumber() {
		int abc[] = { 100, 3000, 5000, 600, 700, 100 };

		int max = abc[0];

		for (int i = 1; i < abc.length; i++) 
		{
			if (abc[i] > max) {
				max = abc[i];
			}
		}

		return max;

	}

	public static void main(String[] args) {

		Demo1 obj = new Demo1();
		int a = obj.maximumNumber();
		System.out.println(a);
}

}