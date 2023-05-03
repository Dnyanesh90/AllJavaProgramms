package StringBuffer;

public class Demo2 {

	public static void main(String[] args) {
		
		StringBuffer sb1 =new StringBuffer("CUCUMBER");
		StringBuffer sb2 =new StringBuffer("CUCUMBER TESTNG");
		
		System.out.println(sb1.length());
//        System.out.println(sb1.capacity());
//        System.out.println(sb1.charAt(5));
//        System.out.println(sb1.codePointAt(5));
//        System.out.println(sb1.indexOf("TESTNG"));
//        System.out.println(sb1.append(" TESTNG"));
//        System.out.println(sb1.append("D"));
//          System.out.println(sb1.reverse());
 //       System.out.println(sb1.delete(2, 3));
 //       System.out.println(sb1.deleteCharAt(5));
 //       System.out.println(sb1.replace(2, 4, "ber"));
//        System.out.println(sb1.reverse().toString());
//        System.out.println(sb1.substring(4));
//		System.out.println(sb2.reverse());
//		System.out.println(sb2.substring(6));
//		System.out.println(sb1.lastIndexOf("JAVA"));
//		System.out.println(sb1.append(5));
		System.out.println(sb1.insert(3, "TEST"));
        
        
        
        
	}

}
