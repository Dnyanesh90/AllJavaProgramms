package Tutorial1;

public class Demo4 {

	public static void main(String[] args) {
		int abc[] = {10,25,20,30,500,40,60,50,35};
		int a=abc[0];
		for(int i=0;i<abc.length;i++)
		{
			if(abc[i]>a)
			{
				a=abc[i];
				
			}
		}
		System.out.println(a);

	}

}
