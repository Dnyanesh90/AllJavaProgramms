package StringBuffer;

public class Demo1 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("SELENIUM");
		StringBuffer sb2=new StringBuffer("TESTNG");
		
		String s=new String("SELENIUM");
		String p=new String("TESTNG");
		
		
		String a= "SELENIUM";
		String b= "TESTNG";
		
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		
		System.out.println(sb1.append(b));
		
		System.out.println(sb1.reverse());
		System.out.println(sb2.reverse());
		
		
		System.out.println("-------------");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(a));
		System.out.println(sb1.equals(b));
		System.out.println("------------------");
		
		System.out.println(sb1==sb2);
		System.out.println(a==b);
		System.out.println(s==p);
		System.out.println("------------------");
		
		System.out.println(sb1.append(s));
		System.out.println(sb2.append(p));
		System.out.println(sb1.append(p));
		System.out.println(sb2.append(s));
		
		System.out.println("------------");
		
		System.out.println(s==a);
		System.out.println(s==b);
		System.out.println(p==a);
		System.out.println(p==b);
		
		System.out.println("------------");
		
		System.out.println(a.equals(s));
		System.out.println(b.equals(s));
		System.out.println(a.equals(p));
		System.out.println(b.equals(p));
		
		System.out.println("------------");
		System.out.println(p.equals(b));
		System.out.println();
		
		
		
	}

}
