package ListCollectionDemo1;

import java.util.ArrayList;

public class Demo4 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList abc = new ArrayList();

		abc.add(1);
		abc.add(2);
		abc.add(3);

		ArrayList xyz = new ArrayList();

		xyz.add(100);
		xyz.add(200);
		xyz.add(300);
		xyz.add(400);

		ArrayList pqr = new ArrayList();

		pqr.add("java");
		pqr.add("selenium");
		pqr.add("testng");

		System.out.println(pqr);
		
		pqr.addAll(xyz);
		
		System.out.println(pqr);//java selenium testng 100 200 300 400 
		
		pqr.addAll(abc);
		
		
		System.out.println(pqr.containsAll(xyz));
		
	

	}

}
