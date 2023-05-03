package StaticNonStatic1;

public class Demo10 {
	public static int maxValue()
	{
		int [] abc= {100,300,400,540,2344};
		int max=abc[0];
		for(int i=0;i<abc.length;i++)
		{
			if(max<abc[i])
			{
				max=abc[i];
			}
			
		}
		return max;
	}


	public static void main(String[] args) {
		System.out.println("MMS");
		//here we calling maxValue() method using classname 
        int a =Demo10.maxValue();
        System.out.println(a);

        System.out.println("MME");

	}

}
