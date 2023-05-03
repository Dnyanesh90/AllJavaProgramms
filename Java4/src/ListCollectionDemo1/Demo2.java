package ListCollectionDemo1;

import java.util.ArrayList;

public class Demo2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
        ArrayList abc =new ArrayList();
		
		abc.add("selenium");
		abc.add(100);
		abc.add(true);
		abc.add(100);
		abc.add("HTML");
		abc.add("jenkins");
	
		ArrayList xyz =new ArrayList();
		
		xyz.add(100);
		xyz.add(200);
		xyz.add(300);
		xyz.add(400);
		
		System.out.println(xyz);//100 200 300 400
		
		xyz.addAll(abc);
		
		System.out.println(xyz);//100 200 300 400 selenium 100 true 100 HTML jenkins
	
		
//		xyz.removeAll(abc);
//		
//		System.out.println(xyz);//100 200 300 400

		

	}

}
