package Scanner;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the any radius:");
		double radius =scanner.nextDouble();
		scanner.close();
		System.out.println("Area of the circle given radius"+radius+" is: "+(Math.PI*radius*radius));

	}
}
