package Interview;

public class Demo3 {

	public static void main(String[] args) {
		String s[]="WELCOME TO JAVA".split(" ");
		String a="";
		for(int i=s.length-1;i>=0;i--)
		{
			a+=s[i]+" ";
		}
		System.out.println(" "+a);
		}
	}


//output-----JAVA TO WELCOME 


