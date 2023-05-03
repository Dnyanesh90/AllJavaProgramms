package Array;

public class Demo17 {

	public static void main(String[] args) {
		int [] a= {10,50,300,0,23,1,500,900};
		
        int abc=a[0];
		
		for(int i=1;i<a.length;i++)
		{	
			if(a[i]>abc)
			{
				abc=a[i];
			}
		}		
		System.out.println(abc);		
	}
}
