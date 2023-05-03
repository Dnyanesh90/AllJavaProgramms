package Scanner;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the first value is:");
		int a =scanner.nextInt();
		System.out.println("enter the second value is:");
		int b =scanner.nextInt();
		
		scanner.close();
		
		System.out.println("addition of two int is:"+(a+b));


	}

}
