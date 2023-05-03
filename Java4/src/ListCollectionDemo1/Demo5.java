package ListCollectionDemo1;

import java.util.ArrayList;

public class Demo5 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList abc = new ArrayList();

		abc.add(500);//4
		abc.add(600);//5
		abc.add(700);//6

		ArrayList xyz = new ArrayList();

		xyz.add(100);//0
		xyz.add(200);//1
		xyz.add(300);//2
		xyz.add(400);//3

		xyz.addAll(abc);
		
		System.out.println(xyz.indexOf(500));
		
	}

}
