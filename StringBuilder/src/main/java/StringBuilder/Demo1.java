package StringBuilder;

public class Demo1 {

	public static void main(String[] args) {
		StringBuilder sb1 =new StringBuilder("DNYANESHWAR");
//		System.out.println(sb1.length());
//		System.out.println(sb1.capacity());
//		System.out.println(sb1.reverse());
//		System.out.println(sb1.append(" KADAM"));
//		System.out.println(sb1.charAt(10));
//		System.out.println(sb1.replace(0, 11, "KADAM"));
//		System.out.println(sb1.substring(5));
//		System.out.println(sb1.append(" KADAM"));
//		System.out.println(sb1.indexOf("1"));
//		System.out.println(sb1.lastIndexOf("1"));
		System.out.println(sb1.insert(10, sb1));
		

	}

}
