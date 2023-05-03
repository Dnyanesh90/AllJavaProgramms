package Array;

public class Demo16 {

	public static void main(String[] args) {
        int [] a= {7,50000,300,0,23,1,500,190000};
		
		int abc=a[0];
		
		for(int i=0;i<a.length;i++)
		{	
			if(a[i]>abc)
			{
				abc=a[i];
			}
		}
		System.out.println(abc);
	}
}
