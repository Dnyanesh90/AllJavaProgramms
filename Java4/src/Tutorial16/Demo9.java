package Tutorial16;

public class Demo9 {

	public static void main(String[] args) {
        String a="cucumber";
		
		String b =a.substring(0,1);
		
		String c =b.toUpperCase();
		System.out.println(c);	//C
		String d =a.substring(1);
		System.out.println(d);//ucumber
		
		System.out.println(c.concat(d));

	}

}
