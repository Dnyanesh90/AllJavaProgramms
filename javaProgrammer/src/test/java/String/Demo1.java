package String;

public class Demo1 {

	public static void main(String[] args) {
		String a="123abc456def789ghi";
		
		char[]p=a.toCharArray();
		for(int i=0;i<p.length;i++)
		{
			if(Character.isDigit(p[i]))
			{
				System.out.print(p[i]);
			}
			//for(int j=0;j<p.length;j++)
			{
			//if(Character.isAlphabetic(p[j]))
			{
				//System.out.print(p[j]);
			}
		}

	}

}
}
