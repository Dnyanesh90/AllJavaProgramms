package Interview;

public class Demo7 {

	public static void main(String[] args) {
		String a="KADAM015DNYAN7569ESH";
		char []p=a.toCharArray();
		for(int i=0;i<p.length;i++)
		{
			if(Character.isAlphabetic(p[i]))
			{
				System.out.print(p[i]);
			}
		}

	}

}


//output-------------KADAMDNYANESH
