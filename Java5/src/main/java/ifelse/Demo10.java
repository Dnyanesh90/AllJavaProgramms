package ifelse;

public class Demo10 {
	public static void main(String[] args) {
		//find max number out of 3 number:
		System.out.println("Main Method is started");
		
		int a=100,b=200,c=250;
		
		if((a>b)&&(a>c))
		{
			System.out.println("A is Large number");
		}
		else if(b>c)
		{
			System.out.println("B is Large Number");
		}
		else{
			System.out.println("C is Large Number");
		}
		
		System.out.println("Main Method is Ended");
	
	}


}
