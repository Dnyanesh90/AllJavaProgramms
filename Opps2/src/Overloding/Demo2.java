package Overloding;

public class Demo2 {

	public void xyz() {
		System.out.println("xyz method");
	}
	
	public void xyz(String a)
	{
		System.out.println("xyz method with 1 String arg "+a);
	}
	
	public void xyz(int a) {
		System.out.println("xyz method with 1 int arg "+a);
	}
	
	public void xyz(float a, float b)
	{
		System.out.println("xyz method with 1 float arg "+(a+b));
	}
	
	public void xyz(int a, float b)
	{
		System.out.println("xyz method with 1 int and 1 float arg "+(a+b));
	}
	

	public static void main(String[] args) {
		Demo2 obj =new Demo2();
		obj.xyz();
		obj.xyz(1000);
		obj.xyz("selenium");
		obj.xyz(12.34f, 244.45f);
		obj.xyz(100, 243.55f);

	}
}
