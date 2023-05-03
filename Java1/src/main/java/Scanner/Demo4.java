package Scanner;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Input Year:");
		int year =scanner.nextInt();
		scanner.close();
		boolean isLeapYear =false;
		if(year %4==0)
		{
			if(year %100==0)
			{
				if(year %400==0)
				{
					isLeapYear =true;
				}
				else
				{
					isLeapYear =false;
				}
			}
				else 
				{
					isLeapYear =true;	
				}
		}
		
		
		else
		{
			isLeapYear =false;
		}
				if(isLeapYear)
				{
					System.out.println("Given year "+year+" is a leap year");
				}
				else
				{
					System.out.println("Given year "+year+" is not a leap year");
				}
			}
		}
		

	


