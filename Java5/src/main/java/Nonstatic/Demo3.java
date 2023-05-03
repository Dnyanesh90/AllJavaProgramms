package Nonstatic;

public class Demo3 {
	public void pune() 
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method is stsrted");
		
		Demo3 obj =new Demo3();
		obj.pune();
		
		System.out.println("Main method is ended");
	}

}
