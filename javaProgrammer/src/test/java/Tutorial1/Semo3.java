package Tutorial1;

public class Semo3 {

	public static void main(String[] args) {
		String a[] ="Welcome to java".split(" ");
		String c="";
		for(int i=a.length-1;i>=0;i--)
		{
			c+=a[i] + " ";
		}
		System.out.println(" "+c);
		System.out.println(c.substring(0, c.length()-1));

	}

}
