package Tutorial1;

public class Semo1 {

	public static void main(String[] args) {
		String a[]="Mumbai Banglore Pune".split(" ");
		String c="";
		for (int i=a.length-1;i>=0;i--)
		{
			c+=a[i] +" "; 
		}
		System.out.println("the output of reverse string is:"+c);
		System.out.println(c.substring(0, c.length()-1));
			
		

	}

}


//the output of reverse string is:Pune Banglore Mumbai 
//Pune Banglore Mumbai
