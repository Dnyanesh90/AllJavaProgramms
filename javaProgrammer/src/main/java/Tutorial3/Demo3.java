package Tutorial3;

public class Demo3 {

	public static void main(String[] args) {
	
			String a[] ="Dnyaneshwar Vyankatrao kadam".split(" ");
			String c="";
			for(int i=a.length-1;i>=0;i--)
			{
				c+=a[i] + " ";
			}
			System.out.println(""+c);
			//System.out.println(c.substring(0, c.length()-1));


	}

}
//OUTPUT-kadam Dnyaneshwar