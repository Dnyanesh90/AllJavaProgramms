package Tutorial17;

public class Demo5 {

	public static void main(String[] args) {
		String a="KADAM02071990";
		
		char[] b=a.toCharArray();
		
		for(int i=0;i<b.length;i++)
		{
			if(Character.isAlphabetic(b[i]))
			{
				System.out.print(b[i]);
			}
			//if(Character.isDigit(b[i]))
			{
				//System.out.print(b[i]);
			}
		}

	}

}
