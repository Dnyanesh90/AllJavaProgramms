package ifelse;

public class Demo7 {

	public static void main(String[] args) {
        int a=10000,b=2000,c=800;
		
		if(a>b)
		{
				if(a>c)
				{
					System.out.println("A is big number");
				}
				else{
					System.out.println("C is big number");
				}
		}
		else if(b>c)
		{
			System.out.println("B is big number");
		}
		else{
			System.out.println("c is big number");
		}	
	}

}
