package Scanner;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter any no:");
		
		int num =scanner.nextInt();
		scanner.close();
		
		if(num%2==0)
		{
			System.out.println(num+ "number given by user is an even no");
		}
		else
		{
			System.out.println(num+"number given by user is an odd no");
		}
		
		
	}

}
