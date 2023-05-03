package Tutorial3;

public class Demo2 {

	public static void main(String[] args) {
		String a="K1A2D3A4M";
		char []b=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(Character.isAlphabetic(b[i]))
			{
				System.out.print(b[i]);
			}
		}
	}

}
