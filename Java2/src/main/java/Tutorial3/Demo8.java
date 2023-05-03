package Tutorial3;

public class Demo8 {

	public static void main(String[] args) {
		String a = "I am an automation tester";
	    //String a="Hello My Auto World";
		String[] b = a.split(" ");
		String c = "";

		
		for(int j=b.length-1;j>=0;j--) 
		{
			for (int i=0;i<b[j].length();i++) {
				c = b[j].charAt(i)+c;
			}
			c=" "+c;
		}
		
		System.out.println(c);

	}
}
