package XYZ;

public class Demo1 {

	public static void main(String[] args) {
	       String s1 = "KADAM";
	       String s2 = "KADAM";
	       String s3 = new String("KADAM");
	       String s4 = new String("KADAM");
	 
	        System.out.println(s1 == s2);     
	        System.out.println(s1 == s3);     
	        System.out.println(s1.equals(s2));   
	        System.out.println(s1.equals(s3));  
	        System.out.println(s3==s4);        

	}

}
//@BeforeTest
//@BeforeMethod
//@Test
//@Test
//@Test
