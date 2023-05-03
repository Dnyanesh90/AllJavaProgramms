package Tutorial1;

public class Demo1 {

	public static void main(String[] args) {
		String[] a="Welcome to java".split(" ");
		String b="";
		for(int i=a.length-1;i>=0;i--) 
		{
			b+=a[i]+" ";
		}
		System.out.println(b);
		}
		
	}


