package ListCollectionDemo1;

import java.util.ArrayList;
import java.util.Collections;

public class Demo6 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList pqr = new ArrayList();
		pqr.add("xyz");
		pqr.add("testng");
		pqr.add("java");
		pqr.add("selenium");
		
		System.out.println(pqr);//xyz testng java selenium
		
		Collections.sort(pqr);
		
		System.out.println(pqr);//java selenium testng xyz
		
		Collections.sort(pqr,Collections.reverseOrder());
		
		System.out.println(pqr);//xyz testng selenium java
		
	}

}
