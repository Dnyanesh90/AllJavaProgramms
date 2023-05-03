package Nonstatic;

public class Demo5 {
	public void a1()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	public void a2()
		{
			String a="Selenium";
			String b="TestNG";
			System.out.println(a.concat(b));
		}
	

	public static void main(String[] args) {
		Demo5 obj =new Demo5();
		obj.a1();
		obj.a2();
		

	}

}
