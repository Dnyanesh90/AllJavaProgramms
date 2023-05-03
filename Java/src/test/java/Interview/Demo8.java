package Interview;

public class Demo8 {

	public static void main(String[] args) {
		String a="KADAM015DNYAN7569";
		char []p=a.toCharArray();
		for(int i=0;i<p.length;i++)
		{
			if(Character.isDigit(p[i]))
			{
				System.out.print(p[i]);
			}
		}


	}

}



//output---------0157569