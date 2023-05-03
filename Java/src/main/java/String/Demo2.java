package String;

public class Demo2 {

	public static void main(String[] args) {
		String a[]="I LOVE MY JAVA PROGRAMMIMG".split(" ");
		String b="";
		for(int i=a.length-1;i>=0;i--)
		{
			b+=a[i]+" ";
		}
		{
			
			System.out.println(""+b);
		}
		
	}
	}

//Output:
//PROGRAMMIMG JAVA MY LOVE I 
