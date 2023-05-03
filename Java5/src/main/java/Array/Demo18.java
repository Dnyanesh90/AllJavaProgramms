package Array;

public class Demo18 {

	public static void main(String[] args) {
		int [] b= {25,52,100,450,850,460,900,2500};
		
		int p=b[0];
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]<p)
			{
				p=b[i];
			}
		}
		System.out.println(p);
	}

}
