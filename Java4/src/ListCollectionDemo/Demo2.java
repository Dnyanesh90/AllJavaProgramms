package ListCollectionDemo;

import java.util.ArrayList;

public class Demo2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList arr1 =new ArrayList();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		
		
		System.out.println(arr1);
		
		arr1.set(1, "selenium");
		
		System.out.println(arr1);		
	}
	}

