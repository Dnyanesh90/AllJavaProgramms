package XYZ;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("MMS");//1

		String a = "Java";

		try {
			System.out.println("try block is started");//2
			int b = a.length();
			System.out.println(b);//3
			System.out.println("try block is ended");//4

		} 
		catch (NullPointerException e) {
			System.out.println("catch block of code");
		}

		System.out.println("MME");//5

	}

}
