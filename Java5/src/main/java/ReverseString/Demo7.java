package ReverseString;

public class Demo7 {

	public static void main(String[] args) {
		
		String str="Nayan,Gaurav,Nikhil,Jay";
		String[] s = str.split(",");
		String output="";
		for(String abc:s)
		{
			String rev="";
			for(int i=abc.length()-1;i>=0;i--)
				
			{
				rev=rev+abc.charAt(i);
			}
			output=output+rev+",";
		}
		System.out.println(output.subSequence(0, output.length()-1));
	}
}


