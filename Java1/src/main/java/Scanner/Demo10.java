package Scanner;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the value:");
		int num =scanner.nextInt();
		scanner.close();
		
		System.out.println("the square of given value is:"+(num*num));
	}

}
