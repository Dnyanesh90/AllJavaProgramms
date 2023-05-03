package loopwhile;

public class Demo9 {

	public static void main(String[] args) {
		int i=25;
		
		while(i<=35)
		{	
			
			if(i!=30)
			{
				System.out.println("i Value inside if cond "+i);//25  26    27
			}
			i++;
			System.out.println("i value outside if condition "+i);//26 27  28
			System.out.println("Pune");//1  2 3
		}
	}

}
