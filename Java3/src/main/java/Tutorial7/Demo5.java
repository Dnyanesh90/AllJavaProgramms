package Tutorial7;

public class Demo5 {

	public void a1(){
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}
	}
	
	public void a2(){
		String a="selenium";
		String b="Testing";
		System.out.println(a.concat(b));//seleniumTesting
	}
	

	public static void main(String[] args) {
		
		Demo5 obj =new Demo5();
		obj.a2();//calling a2 method with the help of object name
		
		obj.a1();
	}

}
