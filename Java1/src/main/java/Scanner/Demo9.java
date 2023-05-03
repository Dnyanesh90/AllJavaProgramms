package Scanner;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter any no:");
		int number =scanner.nextInt();
		
		scanner.close();
		
		int a=1;
		int b=1;
		
		System.out.println(a+" ");
		System.out.println(b+" ");
		
		int c=0;
		while(c<=number)
		{
			c=a+b;
			if(c>number) 
				break;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
	}

}
