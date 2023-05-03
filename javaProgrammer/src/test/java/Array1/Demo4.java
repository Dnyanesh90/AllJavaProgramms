package Array1;

public class Demo4 {

	public static void main(String[] args) {
        String [] abc = {"selenium","testng","pom","jenkins","jdbc"};
		
		for(String b: abc)
		{
			System.out.println(b);
		}
		
		String [] xyz =abc.clone();
		
		for(String a: xyz)
		{
			System.out.println(a);
		}
	}

}
