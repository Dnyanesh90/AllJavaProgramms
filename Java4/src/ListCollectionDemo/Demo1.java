package ListCollectionDemo;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Cucumber");
		arr.add("BDD");
		arr.add("Jenkins");
		arr.add("GitHub");
		arr.add("API Automation");
		arr.add("Database Automation");
		arr.add("HTML Code");
		arr.add("Java Script");
		arr.add("Cypress");

		System.out.println(arr);
		// arr.remove("Java Script");
		arr.remove(7);
		System.out.println(arr);
		
		System.out.println(arr.contains("GitHub"));
		
	}
}
