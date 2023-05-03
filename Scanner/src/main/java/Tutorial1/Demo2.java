package Tutorial1;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter the first value:");		
		int a =scanner.nextInt();
		
		System.out.println("enter the second value:");
		int b =scanner.nextInt();
		scanner.close();
		
		System.out.println("multiplication of two value is:"+(a*b));

	}

}
