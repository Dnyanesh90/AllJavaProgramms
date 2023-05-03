package Scanner;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
	    Scanner  scanner =new Scanner(System.in);
	    System.out.println("enter the first no:");
	    int a = scanner.nextInt();
	    
	    System.out.println("enter the second no:");
	    int b =scanner.nextInt();
	    
	    System.out.println("the sum of two given no is:"+(a+b));
	    scanner.close();
	    
	}

}
