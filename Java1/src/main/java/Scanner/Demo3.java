package Scanner;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner =new  Scanner(System.in);
		System.out.println("enter any number:");
		int num =scanner.nextInt();
		scanner.close();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"x"+i+"="+(i*num));
		}
		

	}

}
