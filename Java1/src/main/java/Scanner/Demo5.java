package Scanner;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter any charatcter");
		
	   char c = scanner.next().charAt(0);
	   scanner.close();
	   boolean isVowel =false;
	   switch(c)
	   {
	   case 'a':
	   case 'e':
	   case 'i':
	   case 'o':
	   case 'u':
	   case 'A':
	   case 'E':
	   case 'I':
	   case 'O':
	   case 'U': isVowel =true;
	   }
	   if(isVowel)
	   {
		   System.out.println(c+" is vowel");
	   }
		   else
		   {
			 System.out.println(c+" is not vowel");	 
		   }
		   }	
	}


