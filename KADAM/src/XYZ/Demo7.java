package XYZ;

public class Demo7 {

	public static void main(String[] args) {
		int a[] = new int[5];

		a[1] = 10;
		a[3] = 20;
		a[0] = 200;
		a[4] = 900;
		try {
			System.out.println("try block is started");
			a[15] = 145;
			System.out.println(a);
			System.out.println("try block is ended");
		}
		catch (Exception e) {
			System.out.println("catch block of code");
		}
		finally {
			System.out.println("Finally block of code");

	}

}
}
