package Tutorial12;

public class Demo3 {
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
		
		Demo3 obj =new Demo3();
		obj.a2();//calling a2 method with the help of object name
		
		obj.a1();
		
}
}