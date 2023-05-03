package Tutorial;

public class Demo4 {
	public static void abc()
	{
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println(i+" "+j);
			
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		Demo4 obj =new Demo4();
		obj.abc();
		System.out.println("MME");
		

	}

}
