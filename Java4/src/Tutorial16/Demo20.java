package Tutorial16;

public class Demo20 {

	public static void main(String[] args) {
		
		//sELENIUM Testing
        String a="Selenium testing";
		
		String[]  b=a.split(" ");
		
		String c =b[0].substring(0,1).toLowerCase()+b[0].substring(1).toUpperCase();
		
		//System.out.println(c);
		
		String d =b[1].substring(0,1).toUpperCase()+b[1].substring(1);
		
		System.out.println(c +" "+d);
		
	}

}
