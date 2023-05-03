package Tutorial1;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter the any value");
		int a =scanner.nextInt();
		
		if(a%2==0) 
		{
			System.out.println(a+" given no is even:");
		}
		else
		{
			System.out.println(a+" given no is odd:");
		}
		scanner.close();
		

	}

}
