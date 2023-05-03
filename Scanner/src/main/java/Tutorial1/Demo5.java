package Tutorial1;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter the first int:");
		int a =scanner.nextInt();
		
		System.out.println("enter the second int:");
		int b =scanner.nextInt();
		
		System.err.println("Addition of two int:"+(a+b));
		scanner.close();

	}

}
