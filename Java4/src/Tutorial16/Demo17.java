package Tutorial16;

public class Demo17 {

	public static void main(String[] args) {
		//aUTOMATION tESTING
		String a="Automation Testing";
		
		String [] b =a.split(" ");
		
		System.out.println(b[0]);
		
		System.out.println(b[0].substring(0,1));
		
		System.out.println(b[0].substring(0, 1).toLowerCase());
		
		System.out.println(b[0].substring(1).toUpperCase());
		
		System.out.println(b[0].substring(0, 1).toLowerCase() +b[0].substring(1).toUpperCase());
		
		
	}

}
