package ifelse;

public class Demo8 {

	public static void main(String[] args) {
        int a=100,b=3400,c=560,d=450,e=2350;
		
		if((a>b)&&(a>c)&&(a>d)&&(a>e))
		{
			System.out.println("A is Big number");
		}
		else if((b>c)&&(b>d)&&(b>e))
		{
			System.out.println("B is big number");
		}
		else if((c>d)&&(c>e))
		{
			System.out.println("C is big number");
		}
		else if(d>e)
		{
			System.out.println("D is big number");
		}
		else{
			System.out.println("E is big number");
		}
		

	}

}
