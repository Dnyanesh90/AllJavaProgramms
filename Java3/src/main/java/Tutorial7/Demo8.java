package Tutorial7;

public class Demo8 {

public void reverserString(String a) {
		
		for (int i=a.length()-1; i >= 0; i--) 
		{
			System.out.print(a.charAt(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Pune");
		Demo8 obj = new Demo8();
		obj.reverserString("selenium");
		System.out.println("Mumbai");
		obj.reverserString("cucumber");
		System.out.println("delhi");
		obj.reverserString("kadam");
	}

}
