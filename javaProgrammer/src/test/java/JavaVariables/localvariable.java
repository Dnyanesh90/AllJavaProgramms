package JavaVariables;

public class localvariable {
	public void m1()
{
	//local instance variable or local non static variable
	 int a=10;

	 String d="";
	
	for(int i=0;i<=10;i++)
	{
		d="Selenium";
		System.out.println(d);
		System.out.println(a);
		
	}
	System.out.println(d);
	System.out.println(a);
}

public static void m2()
{
	 int b=200;
	System.out.println(b);

}

public static void main(String[] args) 
{	
		int c=100;
		System.out.println(c);
		localvariable obj =new localvariable();
		obj.m1();
		localvariable.m2();
}

	

}
