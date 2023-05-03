package Tutorial3;

public class StringOperation extends MathOperation {
	public void combineString() {
		System.out.println(c.concat(d));
	}
	
	public void equalmethod() {
		System.out.println(c.equals(d));
	}
	
	public void reverseString() {
		
		for(int i=c.length()-1;i>=0;i--)
		{
			System.out.print(c.charAt(i));
		}
		System.out.println();
	}
	
}
